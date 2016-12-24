package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class ScoreActivity extends AppCompatActivity {
    //ArrayList<String> playername = new ArrayList();
    static ArrayList<String> rrlist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();

        String  newPlayername =(String) intent.getSerializableExtra("playername");
        rrlist.add(newPlayername);
        ListView PlayerList= (ListView) findViewById(R.id.player_name_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, rrlist);
        PlayerList.setAdapter(adapter);
        Button mButton = (Button) findViewById(R.id.restart);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intention = new Intent(ScoreActivity.this,RegistrationActivity.class);
                startActivity(intention);

            }
        });

    }
}
