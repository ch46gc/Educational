package com.example.android.educational;





import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;




/**
 * This app displays a selection of questions for snowboarding.
 */

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    EditText editText1;
    EditText editText2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    Button resetButton;
    Button submitButton;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "onCreate");
        Answers answers = new Answers();

        TextView questionTextView = findViewById(R.id.textView1);
        TextView answersTextView = findViewById(R.id.checkBox3);

        questionTextView.setText(answers.getQuestionToQuestionsAt());
        answersTextView.setText(answers.getAnswersToQuestionsAt());

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resetButton = findViewById(R.id.resetButton);
        submitButton = findViewById(R.id.submit_button);
    }

    /**
     * This will show if the user answered correctly "Japan" and give +1 point or deduct 1 point if incorrect. It will also show a red pop
     * up box with toast message incorrect or green pop up with toast message correct.
     */
    public void editText1(View v) {
        // Will check if the editText1 is "Japan" the correct answer and give one point.
        String correctAnswer = "Japan";
        EditText quantityCorrect = findViewById(R.id.editText1);
        if (quantityCorrect.getText().toString().trim().equalsIgnoreCase(correctAnswer)) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();

        } else {

            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();
        }


    }


    /**
     * This will show if the user answered correctly "Sherman Poppen" and give +1 point or deduct 1 point if incorrect. It will also show a red pop
     * up box with toast message incorrect or green pop up with toast message correct.
     */

    public void editText2(View v) {
        String correctAnswer = "Sherman Poppen";
        EditText quantityCorrect = findViewById(R.id.editText2);
        if (quantityCorrect.getText().toString().trim().equalsIgnoreCase(correctAnswer)) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();

        } else {

            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }

    }

    /**
     * This is a custom toast message, a green pop up box with a correct message.
     */
    protected void correctToast() {
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(R.string.correct_toast);
        toast.setView(textView);
        toast.show();
    }

    /**
     * This is a custom toast message, a red pop up box with an incorrect message
     */
    protected void incorrectToast() {
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(R.string.incorrect_toast);
        toast.setView(textView);
        toast.show();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    protected void displayScore(int numberOfCorrect) {
        TextView quantityTextView = findViewById(R.id.score_text_view);
        quantityTextView.setText("" + numberOfCorrect);

    }

    /**
     * *
     *
     * @param view This will reset quiz and clear all activity
     */

    public void reset(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);


    }

    private String message(int score) {
        //setting the message
        String finalMessage = "";
        if (score >= 5) {
            finalMessage += "Your score is " + score + " Excellent! You have done Great!" +
                    "\n The list below are the correct answers.  " + "\n  1) 1960 " +
                    "\n  2) Snurfer"
                    + "\n  3)Japan" + "\n  4) Stratton Mountain Resort" +
                    "\n  5) Sherman Poppen" + "\n  6) 6 ";
        } else if (score > 1 && score < 5) {
            finalMessage += "Your score is " + score + " Grab a board an learn something new!"
                    + "\n The list below are the correct answers." + "\n  1) 1960 " + "\n 2) Snurfer" +
                    "\n 3)Japan" + "\n  4) Stratton Mountain Resort" +
                    "\n  5) Sherman Poppen" + "\n  6) 6 ";
        } else {
            finalMessage += "Your score is " + score + " Keep trying, you will get it!" +
                    "\n The list below are the correct answers." + "\n  1) 1960 " + "\n 2) Snurfer" +
                    "\n 3)Japan" + "\n 4) Stratton Mountain Resort" +
                    "\n  5) Sherman Poppen" + "\n  6) 6 ";
        }
        return finalMessage;
    }

    /**
     * Checking the result using the submit button
     **/

    public void submit(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_TEXT, message(count));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Results");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void checkBox1Clicked(View view) {

        //Will check if this checkbox is checked and incorrect.
        //Shows if the user selected incorrect answer "a) 1980".
        //It will also show a red pop up box with toast message incorrect .

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();
        }
    }


    public void checkBox2Clicked(View view) {
        //Will check if this checkbox is checked and incorrect.
        //Shows if the user selected correct answer "b) 1970".
        //It will also show a red pop up box with toast message incorrect .
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();
        }
    }


    public void checkBox3Clicked(View view) {
        //Will check if this checkbox is checked and correct will give a point.
        //Shows if the user selected correct answer "c) 1960".
        //It will also show a green pop up box with toast message correct .
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }

    public void radioButton1Clicked(View view) {
        //Will check if this radiobutton is checked.
        //Shows if the user selected the correct answer "a) Snurfer.
        //It will also show a green pop up box with toast message correct .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }

    public void radioButton2Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect.
        // Shows if the user selected incorrect answer "b) Skis".
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    public void radioButton3Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect.
        //Shows if the user selected incorrect answer " c) Monoski".
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    public void checkBox4Clicked(View view) {
        // Will Check of this checkbox is checked and incorrect.
        //Shows if the user selected the incorrect  answer "a) Sugarbush Resort"
        //It will also show a red pop up box with toast message incorrect .
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    public void checkBox5Clicked(View view) {
        // Will Check if this checkbox is checked and correct will give one point.
        // shows if the user selected the correct answer " b) Stratton Mountain Resort"
        //It will also show a green pop up box with toast message correct .
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }
    public void checkBox6Clicked(View v) {
        // Will Check of this checkbox is checked and incorrect.
        // shows if the user selected the incorrect answer " c) Squaw Valley Resort"
        //It will also show a red pop up box with toast message incorrect .
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }
    public void radioButton4Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect.
        // Shows if the user selected incorrect "a) 5 "
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    public void radioButton5Clicked(View view) {
        //Will check if this radiobutton is checked and correct will give one point.
        // Shows if the user selected correct "b) 6 "
        //It will also show a green pop up box with toast message correct .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }

    public void radioButton6Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect.
        // Shows if the user selected incorrect "c) 7 "
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }
}





