package com.example.android.educational;



import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


import android.widget.TextView;


/**
 * Created by geohi on 2/22/2018.
 */
public class Questions extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);


        TextView textView_questions = (TextView) findViewById(R.id.score_text_view);
        {
            int score = getIntent().getIntExtra("rightAnswers", 0);
            textView_questions.setText(score + " / 7");


        }
        String[] answers = {


                "c) 1960",
                " a) snurfer",
                " Japan ",
                " b) Stratton Mountain Resort",
                " Sherman Poppen",
                " b) 6 ",
        };
    }
}

