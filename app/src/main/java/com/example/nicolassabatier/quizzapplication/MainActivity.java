package com.example.nicolassabatier.quizzapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button mOnePlayer;
    private Button mTwoPlayer;

//    private ImageButton mCountry1;
//    private ImageButton mCountry2;
//    private ImageButton mCountry3;

//    private Country[] mCountryBank = new Country[] {
//            new Country(R.drawable.asean, "ASEAN"),
//            new Country(R.drawable.afghanistan, "Afghanistan"),
//            new Country(R.drawable.albania, "Albania"),
//            new Country(R.drawable.bahamas, "Bahamas"),
//            new Country(R.drawable.bangladesh, "Bangladesh"),
//            new Country(R.drawable.cambodja, "Cambodja"),
//            new Country(R.drawable.vanutau, "Vanutau"),
//    };

//    ListOfQuestion mListOfQuestion = new ListOfQuestion(mCountryBank);

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

//        setContentView(R.layout.listofquestion);
//        mCountry1 = (ImageButton) findViewById(R.id.question_1);
//        mCountry2 = (ImageButton) findViewById(R.id.question_2);
//        mCountry1.setImageResource(mListOfQuestion.getQuestionFlag(0));
//        mCountry2.setImageResource(mListOfQuestion.getQuestionFlag(1));
//        mCountry3 = (ImageButton) findViewById(R.id.test);
//        mCountry3.setImageResource(R.drawable.afghanistan);
    }

}
