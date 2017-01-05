package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import static com.example.nicolassabatier.quizzapplication.R.string.name;


public class MainActivity extends AppCompatActivity {
    private Button mOnePlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOnePlayer = (Button) findViewById(R.id.One_playerButton);
        mOnePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                final Player aplayer = new Player();

                        Intent intention = new Intent(MainActivity.this,RegistrationActivity.class);
                        startActivity(intention);
            }
        });


    }


}