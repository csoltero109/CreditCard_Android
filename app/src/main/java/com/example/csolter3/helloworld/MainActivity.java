package com.example.csolter3.helloworld;

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
                displayPage(page);
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
        Button nextButton = (Button) findViewById(R.id.nextButton);
        Button backButton = (Button) findViewById(R.id.backButton);
        switch (page) {
            case 1:
                //Display CC Number info
                inputType.setText("Credit Card Number");
                nextButton.setEnabled(true);
                backButton.setEnabled(false);
                break;
            case 2:
                //Display CC Provider
                inputType.setText("Credit Card Provider");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 3:
                //Display CC Name
                inputType.setText("Name on Credit Card");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 4:
                //Display Exp Date
                inputType.setText("Expiration Date");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 5:
                //Display Security Code
                inputType.setText("Security Code");
                nextButton.setEnabled(true);
                backButton.setEnabled(true);
                break;
            case 6:
                //Display all info
                inputType.setText("All info");
                nextButton.setEnabled(false);
                backButton.setEnabled(true);
                break;
            default:
                //Error Page
                inputType.setText("Something went wrong");
                break;
        }
    }


}
