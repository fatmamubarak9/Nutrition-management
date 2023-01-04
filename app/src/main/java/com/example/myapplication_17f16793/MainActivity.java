package com.example.myapplication_17f16793;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, wgh, wgh2;
    Button b1, b2, b3, b4, b5, b6;
    DatabaseHelper Db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Db = new DatabaseHelper(this);

        name = (EditText) findViewById(R.id.usname);
        email = (EditText) findViewById(R.id.usemail);
        wgh = (EditText) findViewById(R.id.usweight);
        wgh2 = (EditText) findViewById(R.id.uspound);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);

        startdata();
        addData();
        updateData();
        deleteData();
        viewData();

    }

    public void addData() {
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean insert = Db.insertData(name.getText().toString(), email.getText().toString(), wgh.getText().toString());
                if (insert == true)
                    Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "not inserted", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void startdata(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void updateData() {
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean update = Db.updateData(name.getText().toString(), email.getText().toString(), wgh.getText().toString(), wgh2.getText().toString());
                if (update == true)
                    Toast.makeText(MainActivity.this, "updated", Toast.LENGTH_LONG).show();
                else

                    Toast.makeText(MainActivity.this, "not updated", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void deleteData() {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer del = Db.deleteData(name.getText().toString());
                if (del > 0)
                    Toast.makeText(MainActivity.this, "deleted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "not deleted", Toast.LENGTH_LONG).show();

            }

        });
    }

    public void viewData() {
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor r = Db.getAllData();
                if (r.getCount() == 0) {

                    showMessage("Error", "Nothing found");
                    return;
                }
                StringBuffer bf = new StringBuffer();
                while (r.moveToNext()) {
                    bf.append("name:" + r.getString(0) + "\n");
                    bf.append("email:" + r.getString(1) + "\n");
                    bf.append("weight:" + r.getString(2) + "\n");
                    bf.append("weight in pounds:" + r.getString(3) + "\n");
                }
                showMessage("patient Details", bf.toString());
            }
        });
    }

    public void showMessage(String title, String mes) {
        AlertDialog.Builder ald = new AlertDialog.Builder(this);
        ald.setCancelable(true);
        ald.setTitle(title);
        ald.setMessage(mes);
        ald.show();
    }


    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.miniproject, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem MI)
    {
        int i=MI.getItemId();
        if(i==R.id.item_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(MI);
    }

}

