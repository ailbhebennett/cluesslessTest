package com.example.cluesslesstest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    //ref to buttons
    Button btn_add;
    String EntName[],EntColour[], EntType[];
    RecyclerView lv_clothing_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EntName = getResources().getStringArray(R.array.EntN);
        EntColour= getResources().getStringArray(R.array.EntC);
        EntType  = getResources().getStringArray(R.array.EntT);
        btn_add = findViewById(R.id.btn_add);
        lv_clothing_List = findViewById(R.id.lv_clothing_List);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //button listeners
        btn_add.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Add Button", Toast.LENGTH_LONG).show());

    }



}