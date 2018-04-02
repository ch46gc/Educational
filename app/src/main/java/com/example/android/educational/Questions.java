package com.example.android.educational;

class Questions {
    private String mQuestion;
    private String mAnswer;

    @Override
    public String toString() {
        return "Questions{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mAnswer='" + mAnswer + '\'' +
                '}';
    }

    Questions(String question, String answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    String getQuestion() {
        return mQuestion;
    }

    String getAnswer() {
        return mAnswer;
    }
}


