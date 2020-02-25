package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class data extends AppCompatActivity {
    DatabaseHelper db;
    Button view;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getSupportActionBar().setTitle("Database");

        db=new DatabaseHelper(this);
        view=(Button)findViewById(R.id.view);
        show=(TextView)findViewById(R.id.t1);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=db.showData();
                String data=c.getColumnName(0) + "\t\t" + c.getColumnName(1) + "\t\t" + c.getColumnName(2) + "\t\t" + c.getColumnName(3) + "\n";
                while(c.moveToNext())
                {
                    data=data + c.getString(0) + "\t\t" + c.getString(1) + "\t\t" + c.getString(2) + "\t\t" + c.getString(3) + "\n";
                }
                show.setText(data);
            }
        });
    }
}
