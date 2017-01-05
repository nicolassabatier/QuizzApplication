package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class ScoreActivity extends AppCompatActivity {
    //ArrayList<String> playername = new ArrayList();
    ArrayList<String> rrlist = new ArrayList<String>();//List to print
    ArrayList<Integer> rrlist2 = new ArrayList<Integer>();
    static ArrayList<Player> Playerlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        Bundle mybundle=this.getIntent().getExtras();
        Player newPlayer = (Player) mybundle.getSerializable("newPlayer");
        final List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");
        //Player newPlayer = (Player) intent.getSerializableExtra("newPlayer");
        Playerlist.add(newPlayer);
        SortTheScore(Playerlist);
        int PlayerListSize=Playerlist.size();
        for(int i=0;i<PlayerListSize;i++) {
            rrlist.add(Playerlist.get(i).getName());
            rrlist2.add(Playerlist.get(i).getScore());
        }


        ListView PlayerList = (ListView) findViewById(R.id.player_name_list);//Listview, where the list will be printed
        ListView ScoreList = (ListView) findViewById(R.id.Score_list);//


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, rrlist);//adapater to convert the  list in a readable format for Listview
        PlayerList.setAdapter(adapter);//
        ArrayAdapter<Integer> adapter_score = new ArrayAdapter<Integer>(this, simple_list_item_1, rrlist2);
        ScoreList.setAdapter(adapter_score);

        Button mButton = (Button) findViewById(R.id.restart);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            Intent intention = new Intent(ScoreActivity.this, RegistrationActivity.class);
            startActivity(intention);

        }
    });
        Button mButton2 = (Button) findViewById(R.id.Challenge);
        mButton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intention = new Intent(ScoreActivity.this, SecondPlayerActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("questionsPlay", (Serializable) questionsPlay);
            //intention.putExtra("newPlayer",newPlayer);
            intention.putExtras(bundle);
            startActivity(intention);

        }
    });


    }

    public void SortTheScore(ArrayList<Player> list) {
        int listsize = list.size();
        if (listsize>=1){
            int l=0;
            do {
                for (int ind = 0; ind < listsize-1; ind++) {
                    if (list.get(ind).getScore() < list.get(ind + 1).getScore()) {
                        Collections.swap(list, ind, ind + 1);

                    }
                    else{}
                }
                l++;
            }while ( l < listsize);
        }
        else {}

    }
}

