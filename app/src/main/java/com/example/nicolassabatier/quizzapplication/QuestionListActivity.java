package com.example.nicolassabatier.quizzapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class QuestionListActivity extends AppCompatActivity {

    private ListOfQuestion mListOfQuestion;
    private static final String LIST_OF_QUESTION =
            "listquestion";

    private ImageButton mCountry1;
    private ImageButton mCountry2;
    private ImageButton mCountry3;

    public static Intent newIntent(Context packageContext, ListOfQuestion mListQuestion) {
        Intent i = new Intent(packageContext, QuestionListActivity.class);
        i.putExtra(LIST_OF_QUESTION, mListQuestion);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        mListOfQuestion = bundle.getParcelable(LIST_OF_QUESTION);

        setContentView(R.layout.listofquestion);
        mCountry1 = (ImageButton) findViewById(R.id.question_1);
        mCountry2 = (ImageButton) findViewById(R.id.question_2);
        mCountry1.setImageResource(mListOfQuestion.getQuestionFlag(0));
        mCountry2.setImageResource(mListOfQuestion.getQuestionFlag(1));
        mCountry3 = (ImageButton) findViewById(R.id.test);
        mCountry3.setImageResource(R.drawable.afghanistan);
    }


}
