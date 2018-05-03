package com.example.android.educational;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.MessageFormat;
public class MainActivity extends AppCompatActivity {
    CheckBox mCheckBox1;
    CheckBox mCheckBox2;
    CheckBox mCheckBox3;
    CheckBox mCheckBox4;
    CheckBox mCheckBox5;
    CheckBox mCheckBox6;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    RadioButton mRadioButton4;
    RadioButton mRadioButton5;
    RadioButton mRadioButton6;
    Button mResetButton;
    Button mSubmitButton;
    EditText mEditText2;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
        mCheckBox1 = findViewById(R.id.checkBox1);
        mCheckBox1.setOnCheckedChangeListener(new mCheckChangeListener());
        mCheckBox2 = findViewById(R.id.checkBox2);
        mCheckBox2.setOnCheckedChangeListener(new mCheckChangeListener());
        mCheckBox3 = findViewById(R.id.checkBox3);
        mCheckBox3.setOnCheckedChangeListener(new mCheckChangeListener());
        mCheckBox4 = findViewById(R.id.checkBox4);
        mCheckBox4.setOnCheckedChangeListener(new mCheckChangeListener());
        mCheckBox5 = findViewById(R.id.checkBox5);
        mCheckBox5.setOnCheckedChangeListener(new mCheckChangeListener());
        mCheckBox6 = findViewById(R.id.checkBox6);
        mCheckBox6.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton1 = findViewById(R.id.radioButton1);
        mRadioButton1.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton2 = findViewById(R.id.radioButton2);
        mRadioButton2.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton3 = findViewById(R.id.radioButton3);
        mRadioButton3.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton4 = findViewById(R.id.radioButton4);
        mRadioButton4.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton5 = findViewById(R.id.radioButton5);
        mRadioButton5.setOnCheckedChangeListener(new mCheckChangeListener());
        mRadioButton6 = findViewById(R.id.radioButton6);
        mRadioButton6.setOnCheckedChangeListener(new mCheckChangeListener());
        mSubmitButton = findViewById(R.id.submit_button);
        mResetButton = findViewById(R.id.resetButton);
        mEditText2 = findViewById(R.id.editText2);
        mEditText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String ShermanPoppen = "Sherman Poppen";
                EditText quantityCorrect = findViewById(R.id.editText2);
                if (quantityCorrect.getText().toString().trim().equalsIgnoreCase(ShermanPoppen)) {
                    count += 1;
                    if (count <= 1)
                        System.out.println("Correct");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
    class mCheckChangeListener implements RadioButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            if (isChecked) {
                if (buttonView == mCheckBox1) {
                    count += 1;
                    if (count == 2)
                        System.out.println("Correct");
                    displayScore(count);
                    return;
                }
                if (buttonView == mCheckBox2) {
                    count = 0;
                    if (count <= 0)
                        System.out.println("Incorrect");
                    return;
                }
                if (buttonView == mCheckBox3) {
                    count += 1;
                    if (count <= 0)
                        System.out.println("Correct");
                    displayScore(count);
                    return;
                }
                if (buttonView == mCheckBox4) {
                    count = 0;
                    if (count >= 0)
                        System.out.println("Incorrect");
                    return;
                }
                if (buttonView == mCheckBox5) {
                    count += 1;
                    if (count <= 0)
                        System.out.println("Correct");
                    displayScore(count);
                    return;
                }
                if (buttonView == mCheckBox6) {
                    count += 1;
                    if (count >= 1)
                        System.out.println("Correct");
                    displayScore(count);
                    return;
                }
            }
            if (buttonView == mRadioButton1) {
                count += 1;
                if (count <= 4)
                    System.out.println("Correct");
                displayScore(count);
                return;
            }
            if (buttonView == mRadioButton2) {
                count = 0;
                if (count <= 0)
                    System.out.println("Incorrect");
                return;
            }
            if (buttonView == mRadioButton3) {
                count = 0;
                if (count >= 0)
                    System.out.println("Incorrect");
                return;
            }
            if (buttonView == mRadioButton4) {
                count = 0;
                if (count == 0)
                    System.out.println("Incorrect");
                return;
            }
            if (buttonView == mRadioButton5) {
                count += 1;
                if (count <= 0)
                    System.out.println("Correct");
                displayScore(count);
                return;
            }
            if (buttonView == mRadioButton6) {
                count = 0;
                if (count <= 0)
                    System.out.println("Incorrect");
            }
        }
    }
    public void editText2(View View) {
        String ShermanPoppen = "Sherman Poppen";
        EditText quantityCorrect = findViewById(R.id.editText2);
        if (quantityCorrect.getText().toString().trim().equalsIgnoreCase(ShermanPoppen)) {
            count += 1;
            if (count <= 1)
                System.out.println("Correct");
            displayScore(count);
        } else {
            count += 0;
            System.out.println("Incorrect");
            System.out.println("0");
            displayScore(count);
        }
    }
    protected void displayScore(int numberOfCorrect) {
        TextView quantityTextView = findViewById(R.id.score_text_view);
        quantityTextView.setText(String.valueOf(numberOfCorrect));
    }
    public void reset(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
    public void submit(View view) {
        Toast.makeText(this, MessageFormat.format("Your score is {0}", count), Toast.LENGTH_LONG).show();
        if (mCheckBox1.isChecked() && !mCheckBox2.isChecked() && mCheckBox3.isChecked() && !mCheckBox4.isChecked() &&
                mCheckBox5.isChecked() && mCheckBox6.isChecked() && mRadioButton1.isChecked() && !mRadioButton2.isChecked() &&
                !mRadioButton3.isChecked() && !mRadioButton4.isChecked() && mRadioButton5.isChecked() &&
                !mRadioButton6.isChecked() && mEditText2.getText().toString().trim().equalsIgnoreCase("Sherman Poppen")) {
            Toast.makeText(this, MessageFormat.format("Your score is {0}", count), Toast.LENGTH_LONG).show();
        }
    }
}