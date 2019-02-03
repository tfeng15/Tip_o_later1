package com.example.tip_o_later;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**********************************************************
 * MainActivity.java - Calculate the total proice of bill *
 * and tips                                               *
 *                                                        *
 * Name: Tianyi Feng                                      *
 * Lab: Lab 2 Tip-o-later                                 *
 * Email: tfeng@coastal.edu                               *
 * Date: 1/31/2019                                        *
 **********************************************************/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // call when the user clicks the button
        public void onClickCalculate(View view){
            TextView FinaView =(TextView)findViewById(R.id.FinalView);
            double value = 0.0;

            //get a reference to the TextView
            EditText BillEditTet = (EditText)findViewById(R.id.BillEditText);

            //Give a reference to the spinner
            Spinner service = (Spinner) findViewById(R.id.service);

            //get the selected item in the Spinner
            String Service_level = String.valueOf(service.getSelectedItem());



            value = Double.parseDouble(BillEditTet.getText().toString());

            /*
            * Service_level: poor      -  5% tip   *
            * Service_level: good      -  10%tip   *
            * Service_level: excellent - 20%tip    */
            if(Service_level.equals("Poor")){
                value = value * 1.05;

            }else if(Service_level.equals( "Good")){
                value = value * 1.10;
            }else if(Service_level.equals("Excellent")){
                value =  value * 1.20;
            }
            //Display the result
            FinaView.setText("Your total price is $" + value);


        }
}
