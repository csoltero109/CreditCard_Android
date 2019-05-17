package com.example.csolter3.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView inputType = (TextView) findViewById(R.id.InputType);
        Button nextButton = (Button) findViewById(R.id.nextButton);
        Button backButton = (Button) findViewById(R.id.backButton);
        displayPage(1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page++;
                if(page >= 6) {
                    startActivity(new Intent(MainActivity.this, ConfirmFormSubmission.class));
                }
                else{
                    displayPage(page);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page--;
                displayPage(page);
            }
        });
    }

    public void displayPage(int page){

        TextView inputType = (TextView) findViewById(R.id.InputType);
        TextView stepView = (TextView) findViewById(R.id.StepView);
        Button nextButton = (Button) findViewById(R.id.nextButton);
        Button backButton = (Button) findViewById(R.id.backButton);
        switch (page) {
            case 1:
                //Display CC Number info
                inputType.setText("Credit Card Number");
                stepView.setText("Step 1 of 5");
                stepView.setHint("Please Enter 16 Digit Number");
                nextButton.setEnabled(true);
                backButton.setEnabled(false);
                break;
            case 2:
                //Display CC Provider
                inputType.setText("Credit Card Provider");
                stepView.setText("Step 2 of 5");
                stepView.setHint("Visa, Mastercard, Discovery, etc...");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 3:
                //Display CC Name
                inputType.setText("Name on Credit Card");
                stepView.setText("Step 3 of 5");
                stepView.setHint("Name of cardholder");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 4:
                //Display Exp Date
                inputType.setText("Expiration Date");
                stepView.setText("Step 4 of 5");
                stepView.setHint("Expiration Date");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 5:
                //Display Security Code
                inputType.setText("Security Code");
                stepView.setText("Step 5 of 5");
                stepView.setHint("Please Enter 3 digit security code");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            default:
                //Error Page
                inputType.setText("Something went wrong");
                break;
        }
    }


}
