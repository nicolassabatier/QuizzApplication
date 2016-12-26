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
    static ArrayList<Integer> rrlist2=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();

        Player  newPlayer =(Player) intent.getSerializableExtra("aplayer");
        rrlist.add(newPlayer.getName());
        rrlist2.add(newPlayer.getScore());
        ListView PlayerList= (ListView) findViewById(R.id.player_name_list);
        ListView ScoreList= (ListView) findViewById(R.id.Score_list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, rrlist);
        PlayerList.setAdapter(adapter);
        ArrayAdapter<Integer> adapter_score = new ArrayAdapter<Integer>(this, simple_list_item_1, rrlist2);
        ScoreList.setAdapter(adapter_score);

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
