package com.katherinepowderly.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Global Variable
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void submitButton(View view) {
        Question1();
        Question4();
        Toast.makeText(this, ("Your score is " + score), Toast.LENGTH_SHORT).show();

        Button submitButton = (Button) findViewById(R.id.button1);
        submitButton.setEnabled(false);

    }

    //Restart button to reset quiz
    public void restartButton(View view) {
        int i;
        score = 0;
        RadioGroup radiogroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
        radiogroup1.clearCheck();
        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radiogroup2.clearCheck();
        Toast.makeText(this, "Quiz Reset", Toast.LENGTH_SHORT).show();

        //empty checkboxes
        CheckBox checkBox = (CheckBox) findViewById(R.id.question1answer1);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question1answer2);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question1answer3);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question1answer4);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question4answer1);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question4answer2);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question4answer3);
        checkBox.setChecked(false);
        checkBox = (CheckBox) findViewById(R.id.question4answer4);
        checkBox.setChecked(false);

        for (i = 0; i < 1000; i++){
            Button submitButton = (Button) findViewById(R.id.button1);
            submitButton.setEnabled(true);
        }

    }



    //Question1

    public void Question1() {
        CheckBox liger = (CheckBox) findViewById(R.id.question1answer1);
        CheckBox bengal = (CheckBox) findViewById(R.id.question1answer2);
        CheckBox lion = (CheckBox) findViewById(R.id.question1answer3);
        CheckBox leapord = (CheckBox) findViewById(R.id.question1answer4);

        if (bengal.isChecked() || lion.isChecked() || leapord.isChecked() || liger.isChecked() && bengal.isChecked() || liger.isChecked() && lion.isChecked() || liger.isChecked() && leapord.isChecked())  {
            return;
        } else {
            score += 1;
        }
    }

    //Question2

    public void Question2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question2answerF:
                if (checked)
                    break;
            case R.id.question2answerT:
                if (checked)
                    score += 1;
                break;
        }}

    //Question3
    public void Question3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question3answerF:
                if (checked)
                    break;
            case R.id.question3answerT:
                if (checked)
                    score += 1;
                break;
        }}

    //Question4

    public void Question4() {
        CheckBox siamese = (CheckBox) findViewById(R.id.question4answer1);
        CheckBox persian = (CheckBox) findViewById(R.id.question4answer2);
        CheckBox mau = (CheckBox) findViewById(R.id.question4answer3);
        CheckBox angora = (CheckBox) findViewById(R.id.question4answer4);

        if (siamese.isChecked() || persian.isChecked() || angora.isChecked() || mau.isChecked() && siamese.isChecked() || mau.isChecked() && persian.isChecked() || mau.isChecked() && angora.isChecked())  {
            return;
        } else {
            score += 1;
        }
    }

    //Disables radiobuttons from being clicked at once
    public void clearRadioButtons() {
        RadioGroup radiogroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
        radiogroup1.clearCheck();
        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radiogroup2.clearCheck();

    }


}
