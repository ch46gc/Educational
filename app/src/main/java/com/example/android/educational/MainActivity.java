package com.example.android.educational;





import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    int scoreCheckBox1 = 0;
    int scoreCheckBox2 = 0;
    int scoreCheckBox3 = 0;
    int scoreCheckBox4 = 0;
    int scoreCheckBox5 = 0;
    int scoreCheckBox6 = 0;
    int scoreRadioButton1 = 0;
    int scoreRadioButton2 = 0;
    int scoreRadioButton3 = 0;
    int scoreRadioButton4 = 0;
    int scoreRadioButton5 = 0;
    int scoreRadioButton6 = 0;
    int scoreEditText1 = 0;
    int scoreEditText2 = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);

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
    private void displayForCheckBox1() {

        TextView scoreView = findViewById(R.id.checkBox2);
        scoreView.setText(String.valueOf(0));
    }

       public void checkBox2Clicked(View v) {
        //Will check if this checkbox is checked and incorrect.
        //Shows if the user selected correct answer "b) 1970".
        //It will also show a red pop up box with toast message incorrect .
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    private void displayForCheckBox2() {
        TextView scoreView = findViewById(R.id.checkBox2);
        scoreView.setText(String.valueOf(0));
    }

    public void checkBox3Clicked(View v) {
        //Will check if this checkbox is checked and correct will give a point.
        //Shows if the user selected correct answer "c) 1960".
        //It will also show a green pop up box with toast message correct .
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }

    private void displayForCheckBox3() {
        TextView scoreView = findViewById(R.id.checkBox3);
        scoreView.setText(String.valueOf(0));
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

    private void displayForRadioButton1() {
        TextView scoreView = findViewById(R.id.radioButton1);
        scoreView.setText(String.valueOf(0));

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

    private void displayForRadioButton2() {
        TextView scoreView = findViewById(R.id.radioButton2);
        scoreView.setText(String.valueOf(0));

    }

    public void radioButton3Clicked(View v) {
        //Will check if this radiobutton is checked and incorrect.
        //Shows if the user selected incorrect answer " c) Monoski".
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) v;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }

    }

    private void displayForRadioButton3() {
        TextView scoreView = findViewById(R.id.radioButton3);
        scoreView.setText(String.valueOf(0));


    }


    public void checkBox4Clicked(View v) {
        // Will Check of this checkbox is checked and incorrect.
        //Shows if the user selected the incorrect  answer "a) Sugarbush Resort"
        //It will also show a red pop up box with toast message incorrect .
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }

    }

    private void displayForCheckBox4() {
        TextView scoreView = findViewById(R.id.checkBox4);
        scoreView.setText(String.valueOf(0));


    }


    public void checkBox5Clicked(View v) {
        // Will Check if this checkbox is checked and correct will give one point.
        // shows if the user selected the correct answer " b) Stratton Mountain Resort"
        //It will also show a green pop up box with toast message correct .
        CheckBox checkBox = (CheckBox) v;
        if (checkBox.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }


    private void displayForCheckBox5() {
        TextView scoreView = findViewById(R.id.checkBox5);
        scoreView.setText(String.valueOf(0));

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

    private void displayForCheckBox6() {
        TextView scoreView = findViewById(R.id.checkBox6);
        scoreView.setText(String.valueOf(0));


    }

    public void radioButton4Clicked(View v) {
        //Will check if this radiobutton is checked and incorrect.
        // Shows if the user selected incorrect "a) 5 "
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) v;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }

    }

    private void displayForRadioButton4() {
        TextView scoreView = findViewById(R.id.radioButton4);
        scoreView.setText(String.valueOf(0));

    }

    public void radioButton5Clicked(View v) {
        //Will check if this radiobutton is checked and correct will give one point.
        // Shows if the user selected correct "b) 6 "
        //It will also show a green pop up box with toast message correct .
        RadioButton radioButton = (RadioButton) v;
        if (radioButton.isChecked()) {
            count++;
            System.out.println("Correct");
            System.out.println("1");
            displayScore(count);
            correctToast();
        }
    }

    private void displayForRadioButton5() {
        TextView scoreView = findViewById(R.id.radioButton5);
        scoreView.setText(String.valueOf(0));

    }

    public void radioButton6Clicked(View v) {
        //Will check if this radiobutton is checked and incorrect.
        // Shows if the user selected incorrect "c) 7 "
        //It will also show a red pop up box with toast message incorrect .
        RadioButton radioButton = (RadioButton) v;
        if (radioButton.isChecked()) {
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
            incorrectToast();

        }
    }

    private void displayForRadioButton6() {
        TextView scoreView = findViewById(R.id.radioButton6);
        scoreView.setText(String.valueOf(0));


    }

    /**
     * This will show if the user answered correctly "Japan" and give +1 point or deduct 1 point if incorrect. It will also show a red pop
     * up box with toast message incorrect or green pop up with toast message correct.
     */
    public void editText1(View view) {
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


    private void displayForEditText1() {
        TextView scoreView = findViewById(R.id.editText1);
        scoreView.setText(String.valueOf(0));



    }

    /**
     * This will show if the user answered correctly "Sherman Poppen" and give +1 point or deduct 1 point if incorrect. It will also show a red pop
     * up box with toast message incorrect or green pop up with toast message correct.
     */

    public void editText2(View view) {
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


    private void displayForEditText2() {
        TextView scoreView = findViewById(R.id.editText2);
        scoreView.setText(String.valueOf(0));

    }

    public void score(View view) {

        scoreCheckBox1 = 0;
        scoreCheckBox2 = 0;
        scoreCheckBox3 = 0;
        scoreCheckBox4 = 0;
        scoreCheckBox5 = 0;
        scoreCheckBox6 = 0;
        scoreRadioButton1 = 0;
        scoreRadioButton2 = 0;
        scoreRadioButton3 = 0;
        scoreRadioButton4 = 0;
        scoreRadioButton5 = 0;
        scoreRadioButton6 = 0;
        scoreEditText1 = 0;
        scoreEditText2 = 0;
        displayForCheckBox1();
        displayForCheckBox2();
        displayForCheckBox3();
        displayForCheckBox4();
        displayForCheckBox5();
        displayForCheckBox6();
        displayForRadioButton1();
        displayForRadioButton2();
        displayForRadioButton3();
        displayForRadioButton4();
        displayForRadioButton5();
        displayForRadioButton6();
        displayForEditText1();
        displayForEditText2();

    }

    /**
     * This is a custom toast message, a green pop up box with a correct message.
     */
    private void correctToast() {
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
    private void incorrectToast() {
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
    private void displayScore(int numberOfCorrect) {
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
        Button button = findViewById(R.id.resetButton);

    }

    /**
     * Checking the result using the submit button
     **/

    public void submit(View view) {
        Button submitButton = findViewById(R.id.submit_button);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Your total score " + count + " points" + "\n The list below are the correct answers.  " + "\n  1) 1960 " +
                "\n  2) Snurfer"
                + "\n  3)Japan" + "\n  4) Stratton Mountain Resort" +
                "\n  5) Sherman Poppen" + "\n  6) 6 " );

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

            Toast.makeText(MainActivity.this, "Excellent! You have done Great!", Toast.LENGTH_LONG).show();
            count++;

        }

    }
}








