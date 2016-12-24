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
        Intent intent = new Intent(this, QuestionListActivity.class);
        startActivity(intent);
    }

}
