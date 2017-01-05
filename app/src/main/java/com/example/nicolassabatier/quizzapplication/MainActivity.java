package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button mOnePlayer;
    private Button mTwoPlayer;

    public Country[] mCountryBank = new Country[] {
            new Country(R.drawable.asean, "ASEAN"), new Country(R.drawable.afghanistan, "Afghanistan"), new Country(R.drawable.albania, "Albania"),
            new Country(R.drawable.africanunion, "African Union"), new Country(R.drawable.anericansanoa, "Americans Amoa"), new Country(R.drawable.algeria, "Algeria"),
            new Country(R.drawable.bangladesh, "Bangladesh"), new Country(R.drawable.bahrain, "Bahrain"),
            new Country(R.drawable.barbados, "Barbados"), new Country(R.drawable.belarus, "Belarus"),
            new Country(R.drawable.belize, "Belize"), new Country(R.drawable.benin, "Benin"),
            new  Country(R.drawable.bhutan, "Bhutan"), new Country(R.drawable.bolivia, "Bolivia"), new Country(R.drawable.bosniaherzegovina, "Bosnia Herzegovina"),
            new Country(R.drawable.vanutau, "Vanutau"),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOnePlayer = (Button) findViewById(R.id.onePlayer);
        mOnePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("Lol");
            }
        });
        mTwoPlayer = (Button) findViewById(R.id.twoPlayer);

    }

    public void sendMessage(View view)
    {
        ListOfQuestion mListOfQuestion = new ListOfQuestion(mCountryBank);
        Intent i = QuestionListActivity.newIntent(MainActivity.this, mListOfQuestion);
        startActivity(i);
    }

}
