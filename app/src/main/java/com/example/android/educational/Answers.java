package com.example.android.educational;

import java.util.ArrayList;
import java.util.List;


class Answers {
    private List<Questions> mQuestions;

    Answers() {
        mQuestions = new ArrayList<>();

        //Question 1 and answer
        mQuestions.add(new Questions("What year was snowboarding invented?", "1960"));
        //Question 2 and answer
        mQuestions.add(new Questions(" Which of these are a predecessor of the snowboard?", "Snurfer"));
        //Question 3 and answer
        mQuestions.add(new Questions("The 1998 winter olympics were the first to include snowboarding what country were they held in?", "Japan"));
        //Question 4 and answer
        mQuestions.add(new Questions("  Snowboarding was banned until the early 1980\'s at resorts." +
                " Which of these opened its slopes up to snowboarding in 1983 – 1984 ?", "Stratton Mountain Resort"));
        //Question 5 and answer
        mQuestions.add(new Questions(" Who was the father of snowboarding??", "Sherman Poppen"));
        //Question 6 and answer
        mQuestions.add(new Questions(" How many layers make up a snowboard construction sandwich?", "6"));}


    String getAnswersToQuestionsAt() {
        return mQuestions.get(0).getAnswer();
    }

    String getQuestionToQuestionsAt() {
        return mQuestions.get(0).getQuestion();
    }
}

