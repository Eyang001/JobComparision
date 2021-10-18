package edu.gatech.seclass.jobcompare6300;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Controller controller;
    private Button enterCurrentJobButton;
    private Button enterJobOfferButton;
    private Button adjustWeigthsButton;
    private Button compareOffersButton;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        controller = new Controller();

        enterCurrentJobButton = (Button) findViewById(R.id.enterCurrentJobButton);
        enterJobOfferButton = (Button) findViewById(R.id.enterJobOfferButton);
        adjustWeigthsButton = (Button) findViewById(R.id.adjustWeightsButton);
        compareOffersButton = (Button) findViewById(R.id.compareJobOffersButton);
        exitButton = (Button) findViewById(R.id.exitButton);
        Toast.makeText(this.getApplicationContext(), "Welcome to the job compare app!", Toast.LENGTH_LONG).show();
    }

    //https://developer.android.com/training/basics/firstapp/starting-activity
    public void editCurrentJob(View view){
        Intent intent = new Intent(this, EnterJobActivity.class); //start enter current job activity, pass it controller
        startActivity(intent);
    }

    public void enterJobOffer(View view){
        Intent intent = new Intent(this, EnterJobOfferActivity.class);
        startActivity(intent);
    }

    public void adjustComparisonWeights(View view){
        Intent intent = new Intent(this, AdjustWeightsActivity.class);
        startActivity(intent);
    }

    public void compareJobOffers(View view){
        Intent intent = new Intent(this, CompareOffersActivity.class);
        startActivity(intent);
    }

    public void exit(View view){
        this.finishAffinity();
    }
}