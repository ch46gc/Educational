package com.example.android.educational;





import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.text.Editable;
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

    int rightAnswers = 0;
    int total = 12; //total number of questions
    int point = 1; //Points per correct answer
    int score = total * point; //equation for  score


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);


    }

    public void increment(View view) {
        if (count == 10) {
            return;
        }
        count = count + 1;
        displayScore(count);


    }

    public void decrement(View view) {
        if (count != 1) {
            return;
        }
        count = count - 1;
        displayScore(count);


    }


    public void checkBox1Clicked(View view) {
        //Will check if this checkbox is checked.
        //Shows if the user selected incorrect answer "a) 1980".

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

        displayScore(count);


    }

    public void displayForCheckBox1() {
        TextView scoreView = findViewById(R.id.a_1980);
        scoreView.setText(String.valueOf(0));
        count = count - 1;

    }

    public void checkBox2Clicked(View v) {
        //Will check if this checkbox is checked.
        //Shows if the user selected correct answer "b) 1970".

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

        displayScore(count);


    }

    public void displayForCheckBox2(int score) {
        TextView scoreView = findViewById(R.id.checkBox2);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }

    public void checkBox3Clicked(View v) {
        //Will check if this checkbox is checked.
        //Shows if the user selected correct answer "c) 1960".
        scoreCheckBox3 = scoreCheckBox3 + 3;
        if (count == 7) {
            return;
        }
        count = count + 1;
        displayScore(count);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText("CORRECT !");
        toast.setView(textView);
        toast.show();

    }

    public void displayForCheckBox3(int score) {
        TextView scoreView = findViewById(R.id.checkBox3);
        scoreView.setText(String.valueOf(score));
        count = count + 1;
    }


    public void radioButton1Clicked(View view) {
        //Will check if this radiobutton is checked.
        //Shows if the user selected the correct answer "a) Snurfer.
        scoreRadioButton1 = scoreRadioButton1 + 3;
        if (count == 7) {
            return;
        }
        count = count + 1;
        displayScore(count);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText("CORRECT !");
        toast.setView(textView);
        toast.show();

    }

    public void displayForRadioButton1(int score) {
        TextView scoreView = findViewById(R.id.radioButton1);
        scoreView.setText(String.valueOf(score));
        count = count + 1;
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);


    }

    public void radioButton2Clicked(View view) {
        //Will check if this radiobutton is checked.
        // Shows if the user selected incorrect answer "b) Skis".

        displayScore(count);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

    }

    public void displayForRadioButton2(int score) {
        TextView scoreView = findViewById(R.id.radioButton2);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }

    public void radioButton3Clicked(View v) {
        //Will check if this radiobutton is checked.
        //Shows if the user selected incorrect answer " c) Monoski".
        displayScore(count);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

    }

    public void displayForRadioButton3(int score) {
        TextView scoreView = findViewById(R.id.radioButton3);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }


    public void checkBox4Clicked(View v) {
        // Will Check of this checkbox is checked.
        // shows if the user selected the incorrect  answer "a) Sugarbush Resort"

        displayScore(count);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();
    }


    public void displayForCheckBox4(int score) {
        TextView scoreView = findViewById(R.id.checkBox4);
        scoreView.setText(String.valueOf(score));
        count = count - 1;

    }


    public void checkBox5Clicked(View v) {
        // Will Check of this checkbox is checked.
        // shows if the user selected the correct answer " b) Stratton Mountain Resort"
        scoreCheckBox5 = scoreCheckBox5 + 3;
        if (count == 7) {
            return;


        }
        count = count + 1;
        displayScore(count);
        Toast.makeText(this, " You are doing Great!", Toast.LENGTH_SHORT).show();
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText("CORRECT !");
        toast.setView(textView);
        toast.show();

    }


    public void displayForCheckBox5(int score) {
        TextView scoreView = findViewById(R.id.checkBox5);
        scoreView.setText(String.valueOf(score));
        count = count + 1;
    }

    public void checkBox6Clicked(View v) {
        // Will Check of this checkbox is checked.
        // shows if the user selected the incorrect answer " c) Squaw Valley Resort"

        displayScore(count);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

    }

    public void displayForCheckBox6(int score) {
        TextView scoreView = findViewById(R.id.checkBox6);
        scoreView.setText(String.valueOf(score));
        count = count - 1;

    }

    public void radioButton4Clicked(View v) {
        //Will check if this radiobutton is checked.
        // Shows if the user selected incorrect "a) 5 "

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

        displayScore(count);

    }

    public void displayForRadioButton4(int score) {
        TextView scoreView = findViewById(R.id.radioButton4);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }

    public void radioButton5Clicked(View v) {
        //Will check if this radiobutton is checked.
        // Shows if the user selected correct "b) 6 "
        scoreRadioButton5 = scoreRadioButton5 + 3;
        if (count == 7) {
            return;
        }
        count = count + 1;
        displayScore(count);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText("CORRECT !");
        toast.setView(textView);
        toast.show();

    }

    public void displayForRadioButton5(int score) {
        TextView scoreView = findViewById(R.id.radioButton5);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }

    public void radioButton6Clicked(View v) {
        //Will check if this radiobutton is checked.
        // Shows if the user selected correct "c) 7 "

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(Color.RED);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(32);

        Typeface t = Typeface.create("serif", Typeface.BOLD);
        textView.setTypeface(t);
        textView.setPadding(40, 40, 40, 40);
        textView.setText(" INCORRECT ");
        toast.setView(textView);
        toast.show();

        displayScore(count);


    }

    public void displayForRadioButton6(int score) {
        TextView scoreView = findViewById(R.id.radioButton6);
        scoreView.setText(String.valueOf(score));
        count = count - 1;
    }

              public void editText1(View view) {


                scoreEditText1 = scoreEditText1 + 1;
                if (count == 7) {

            return;
        }
        count = count + 3;
        displayScore(count);
        Toast.makeText(this, "Japan is  the correct answer.", Toast.LENGTH_LONG).show();


    }

    public void displayForEditText1(int score) {
        TextView scoreView = findViewById(R.id.editText1);
        scoreView.setText(String.valueOf(score));
        count = count - 1;


    }

    public void editText2(View view) {
        scoreEditText2 = scoreEditText2 + 1;
        if (count == 7) {
            return;
        }
        count = count + 3;
        displayScore(count);
        Toast.makeText(this, "Sherman Poppen is  the correct answer.", Toast.LENGTH_LONG).show();
    }

    public void displayForEditText2(int score) {
        TextView scoreView = findViewById(R.id.editText2);
        scoreView.setText(String.valueOf(score));
        count = count - 1;

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
        displayForCheckBox2(0);
        displayForCheckBox3(0);
        displayForCheckBox4(0);
        displayForCheckBox5(0);
        displayForCheckBox6(0);
        displayForRadioButton1(0);
        displayForRadioButton2(0);
        displayForRadioButton3(0);
        displayForRadioButton4(0);
        displayForRadioButton5(0);
        displayForRadioButton6(0);
        displayForEditText1(0);
        displayForEditText2(0);


    }


    /**
     * This method is called when the submit button is clicked.
     */
    public void Submit(View view) {

        EditText countryField = findViewById(R.id.editText1);
        Editable countryEditable = countryField.getText();
        String country = countryEditable.toString();


        EditText nameField = findViewById(R.id.editText2);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();


        CheckBox a1980CheckBox1 = findViewById(R.id.checkBox1);
        boolean hasA1980CheckBox1 = a1980CheckBox1.isChecked();

        CheckBox b1970CheckBox2 = findViewById(R.id.checkBox2);
        boolean hasB1970CheckBox2 = b1970CheckBox2.isChecked();

        CheckBox c1960CheckBox3 = findViewById(R.id.checkBox3);
        boolean c1960CheckBox3Checked = c1960CheckBox3.isChecked();


        RadioButton snurferRadioButton = findViewById(R.id.radioButton1);
        boolean hasSnurferChecked = snurferRadioButton.isChecked();

        RadioButton skisRadioButton = findViewById(R.id.radioButton2);
        boolean skisRadioButtonChecked = skisRadioButton.isChecked();

        RadioButton monoskiRadioButton = findViewById(R.id.radioButton3);
        boolean monoskiRadioButtonChecked = monoskiRadioButton.isChecked();

        CheckBox sugarbushResortCheckBox4 = findViewById(R.id.checkBox4);
        boolean sugarbushResortCheckBox4Checked = sugarbushResortCheckBox4.isChecked();

        CheckBox strattonMountainResortCheckBox5 = findViewById(R.id.checkBox5);
        boolean strattonMountainResortCheckBox5Checked = strattonMountainResortCheckBox5.isChecked();

        CheckBox squawValleyResortCheckBox6 = findViewById(R.id.checkBox6);
        boolean squawValleyResortCheckBox6Checked = squawValleyResortCheckBox6.isChecked();

        RadioButton a4RadioButton = findViewById(R.id.radioButton4);
        boolean a4RadioButtonChecked = a4RadioButton.isChecked();

        RadioButton b5RadioButton = findViewById(R.id.radioButton5);
        boolean b5RadioButtonChecked = b5RadioButton.isChecked();

        RadioButton c7RadioButton = findViewById(R.id.radioButton6);
        boolean c6RadioButtonChecked = c7RadioButton.isChecked();

        {

            int score = calculateScore(hasA1980CheckBox1, hasB1970CheckBox2, c1960CheckBox3Checked,
                    hasSnurferChecked, skisRadioButtonChecked, monoskiRadioButtonChecked, sugarbushResortCheckBox4Checked,
                    strattonMountainResortCheckBox5Checked, squawValleyResortCheckBox6Checked, a4RadioButtonChecked, b5RadioButtonChecked,
                    c6RadioButtonChecked);
        }
    }


    private int calculateScore(boolean addA1980CheckBox1, boolean addB1970CheckBox2,
                               boolean addc1960CheckBox3Checked, boolean addSnurferChecked,
                               boolean addSkisRadioButtonChecked, boolean addMonoskiRadioButtonChecked,
                               boolean addSugarbushResortCheckBox4Checked,
                               boolean addStrattonMountainResortCheckBox5Checked,
                               boolean addSquawValleyResortCheckBox6Checked,
                               boolean addA4RadioButtonChecked, boolean addB5RadioButtonChecked,
                               boolean addC6RadioButtonChecked) {


        int score = 0;
        int correct = 0;
        int incorrect = 0;


        while (score <= incorrect)
            //Add 1 if user selects  A1980CheckBox1
            if (addA1980CheckBox1) {
                score += incorrect;
            } else {

                score -= incorrect;
            }
        while (score <= incorrect)
            //Add 1 if user select B1970CheckBox2
            if (addB1970CheckBox2) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= correct)
            if (addc1960CheckBox3Checked) {
                score += correct;
            } else {
                score -= incorrect;
            }
        while (score <= correct)
            if (addSnurferChecked) {
                score += correct;
            } else {
                score -= incorrect;
            }
        while (score <= incorrect)
            if (addSkisRadioButtonChecked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= incorrect)
            if (addMonoskiRadioButtonChecked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= incorrect)
            if (addSugarbushResortCheckBox4Checked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= correct)
            if (addStrattonMountainResortCheckBox5Checked) {
                score += correct;
            } else {
                score -= incorrect;

            }
        while (score <= incorrect)
            if (addSquawValleyResortCheckBox6Checked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= incorrect)
            if (addA4RadioButtonChecked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }
        while (score <= correct)
            if (addB5RadioButtonChecked) {
                score += correct;
            } else {
                score -= incorrect;
            }
        while (score <= incorrect)
            if (addC6RadioButtonChecked) {
                score += incorrect;
            } else {
                score -= incorrect;
            }


        return score;

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayScore(int numberOfCorrect) {

        TextView quantityTextView = findViewById(R.id.score_text_view);
        quantityTextView.setText("" + numberOfCorrect);

    }


    public void reset(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        Button button = findViewById(R.id.resetButton);


    }




}

