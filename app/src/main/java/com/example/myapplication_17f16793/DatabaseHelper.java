package com.example.myapplication_17f16793;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper

{
    public static final String DATABASE_NAME="patient.db";
    public static final String TABLE_NAME="patient";
    public static final String COL1="name";
    public static final String COL2="email";
    public static final String COL3="weight";
    public static final String COL4="weight_in_pound";

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL("create table " +TABLE_NAME+ "(name TEXT , email TEXT,weight TEXT,weight_in_pound INTEGER)");

    }

    public void onUpgrade(SQLiteDatabase sdb, int oldV, int newV)
    {
        sdb.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sdb);
    }
    public boolean insertData(String n, String em, String wei)
    {
        SQLiteDatabase sdb=this.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL2,n);
        contentValues.put(COL3,em);
        contentValues.put(COL4,wei);
        long result=sdb.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;

    }
    public boolean updateData(String n, String em, String wei, String wei2)
    {
        SQLiteDatabase sdb=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL1,n);
        contentValues.put(COL2,em);
        contentValues.put(COL3,wei);
        contentValues.put(COL4,wei2);
        sdb.update(TABLE_NAME,contentValues,"name=?",new String[]{n});
        return true;
    }
    public Integer deleteData(String n)
    {
        SQLiteDatabase sdb=this.getWritableDatabase();
        return sdb.delete(TABLE_NAME,"name=?",new String[]{n});
    }
    public Cursor getAllData(){
        SQLiteDatabase sdb=this.getWritableDatabase();
        Cursor cursor=sdb.rawQuery("select * from " +TABLE_NAME,null);
        return cursor;
    }
}
