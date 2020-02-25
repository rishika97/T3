package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class subete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subete);
        getSupportActionBar().setTitle("Subete");
    }
    public  void game(View v){
        startActivity(new Intent(subete.this,GAME.class));
    }
    public  void data(View v){
        startActivity(new Intent(subete.this,data.class));
    }
    public  void one(View v){
        startActivity(new Intent(subete.this,one.class));
    }
}
