package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

import static com.example.nicolassabatier.quizzapplication.R.id.add;
import static com.example.nicolassabatier.quizzapplication.R.id.player_name_list;

public class RegistrationActivity extends AppCompatActivity
{

    public ArrayList<Player> playername = new ArrayList<Player>();


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Button mStartButton = (Button) findViewById(R.id.Start_Button);
        mStartButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Player aplayer = new Player();
                EditText nameField = (EditText) findViewById(R.id.registration_name);
                String name = nameField.getText().toString();
                aplayer.setName(name);
                aplayer.setScore(15);
                //playername = aplayer.getName();
                Intent intention = new Intent(RegistrationActivity.this,Playing.class);
                intention.putExtra("aplayer",aplayer);
                startActivity(intention);

            }
        });
    }
}

