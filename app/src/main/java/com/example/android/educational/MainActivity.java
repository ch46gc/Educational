package com.example.android.educational;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
/**
 * This app displays a selection of questions for Snowboarding.
 */
public class MainActivity extends AppCompatActivity {
    TextView mQuestionsTextView;
    Button mCheckBox;
    Button mRadioButton;
    Button mResetButton;
    Button mSubmitButton;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "onCreate");
        mQuestionsTextView = findViewById(R.id.textView1);
        mQuestionsTextView = findViewById(R.id.textView2);
        mQuestionsTextView = findViewById(R.id.textView3);
        mQuestionsTextView = findViewById(R.id.textView4);
        mQuestionsTextView = findViewById(R.id.textView5);
        mQuestionsTextView = findViewById(R.id.textView6);
        mCheckBox = findViewById(R.id.checkBox1);
        mCheckBox = findViewById(R.id.checkBox2);
        mCheckBox = findViewById(R.id.checkBox3);
        mCheckBox = findViewById(R.id.checkBox4);
        mCheckBox = findViewById(R.id.checkBox5);
        mCheckBox = findViewById(R.id.checkBox6);
        mRadioButton = findViewById(R.id.radioButton1);
        mRadioButton = findViewById(R.id.radioButton2);
        mRadioButton = findViewById(R.id.radioButton3);
        mRadioButton = findViewById(R.id.radioButton4);
        mRadioButton = findViewById(R.id.radioButton5);
        mRadioButton = findViewById(R.id.radioButton6);
        mSubmitButton = findViewById(R.id.submit_button);
        mResetButton = findViewById(R.id.resetButton);
    }
    /**
     * This will show if the user answered correctly "Japan" and give +1 point or deduct 1 point if incorrect.
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
            } else {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    /**
     * This will show if the user answered correctly "Sherman Poppen" and give +1 point or deduct 1 point if incorrect.
     */
    public void editText2(View v) {
        String correctAnswer = "Sherman Poppen";
        EditText quantityCorrect = findViewById(R.id.editText2);
        if (quantityCorrect.getText().toString().trim().equalsIgnoreCase(correctAnswer)) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            } else {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
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
        //Sets a message with correct answers and an extra message.
        String finalMessage = "";
        if (score >= 5) {
            finalMessage += "Your score is " + score + " Excellent! You have done Great!" +
                    "\n The list below are the correct answers.  " +
                    "\n 1) Rocker and Camber " +
                    "\n 2) Snurfer" +
                    "\n 3) Japan" +
                    "\n 4) Sage Kotsenburg and Jamie Anderson " +
                    "\n 5) Sherman Poppen" +
                    "\n 6) Stratton Mountain Resort ";
        } else if (score > 1 && score < 5) {
            finalMessage += "Your score is " + score + " Grab a board an learn something new!"
                    + "\n The list below are the correct answers." +
                    "\n 1) Rocker and Camber " +
                    "\n 2) Snurfer" +
                    "\n 3) Japan" +
                    "\n 4) Sage Kotsenburg and Jamie Anderson" +
                    "\n 5) Sherman Poppen" +
                    "\n 6) Stratton Mountain Resort ";
        } else {
            finalMessage += "Your score is " + score + " Keep trying, you will get it!" +
                    "\n The list below are the correct answers." +
                    "\n  1) Rocker and Camber " +
                    "\n  2) Snurfer" +
                    "\n  3) Japan" +
                    "\n  4) Sage Kotsenburg and Jamie Anderson " +
                    "\n  5) Sherman Poppen" +
                    "\n  6) Stratton Mountain Resort ";
        }
        return finalMessage;
    }
    /**
     * Sending the results using the submit button.
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
        //Will check if this checkbox is checked and correct will give a point.
        //Shows if the user selected correct answer "a)Rocker".
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            }
    }
    public void checkBox2Clicked(View view) {
        //Will check if this checkbox is checked and incorrect no point given.
        //Shows if the user selected incorrect answer "b) Gradle".
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    public void checkBox3Clicked(View view) {
        //Will check if this checkbox is checked and correct a point will be given.
        //Shows if the user selected correct answer "c) Camber".
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            }
    }
    public void radioButton1Clicked(View view) {
        //Will check if this radiobutton is checked correct a point will be given.
        //Shows if the user selected the correct answer "a) Snurfer.
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            }
    }
    public void radioButton2Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect no point given.
        // Shows if the user selected incorrect answer "b) Skis".
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    public void radioButton3Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect no point given.
        //Shows if the user selected incorrect answer " c) Monoski".
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    public void checkBox4Clicked(View view) {
        // Will Check of this checkbox is checked and incorrect no point given.
        //Shows if the user selected the incorrect  answer "a) Lindsey Jacobellis"
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    public void checkBox5Clicked(View view) {
        // Will Check if this checkbox is checked and correct will give one point.
        // shows if the user selected the correct answer " b) Sage Kotsenburg"
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            }
    }
    public void checkBox6Clicked(View v) {
        // Will Check of this checkbox is checked and correct will give a point.
        // shows if the user selected the correct answer " c) Jamie Anderson"
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
        }
    }
    public void radioButton4Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect no points given.
        // Shows if the user selected incorrect "a) SugarBush Resort "
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
    public void radioButton5Clicked(View view) {
        //Will check if this radiobutton is checked and correct will give one point.
        // Shows if the user selected correct "b) Stratton Mountain Resort "
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            }
    }
    public void radioButton6Clicked(View view) {
        //Will check if this radiobutton is checked and incorrect no points given.
        // Shows if the user selected incorrect "c) Squaw Valley Resort "
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            }
    }
}

