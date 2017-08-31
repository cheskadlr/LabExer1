package com.example.cheskadelarosa.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Q1, et_Q2, et_SW, et_LabExer, et_MajorEx;
    Button btn_Compute;
    int val_Q1, val_Q2, val_SW, val_LabExer, val_MajorEx ;
    double val_RA = 0;
    String RA, transmuted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callComputeGrade(View view){
        et_Q1 = (EditText) findViewById(R.id.etQ1);
        et_Q2 = (EditText) findViewById(R.id.etQ2);
        et_SW = (EditText) findViewById(R.id.etSW);
        et_LabExer = (EditText) findViewById(R.id.etLabExer);
        et_MajorEx = (EditText) findViewById(R.id.etMajorEx);

        val_Q1 = Integer.parseInt(et_Q1.getText().toString());
        val_Q2 = Integer.parseInt(et_Q2.getText().toString());
        val_SW = Integer.parseInt(et_SW.getText().toString());
        val_LabExer = Integer.parseInt(et_LabExer.getText().toString());
        val_MajorEx = Integer.parseInt(et_MajorEx.getText().toString());

        val_RA = (val_Q1 * .1) + (val_Q2 * .1) + (val_SW * .1) + (val_LabExer * .4) + (val_MajorEx * .3);
        val_RA = Math.round(val_RA * 100);
        val_RA = val_RA/100;

        if(val_RA < 60){transmuted = "Failed";}
        else if(60 >= val_RA || val_RA <= 65){transmuted = "3.0";}
        else if(66 >= val_RA || val_RA <= 70){transmuted = "2.75";}
        else if(71 >= val_RA || val_RA <= 75){transmuted = "2.5";}
        else if(76 >= val_RA || val_RA <= 80){transmuted = "2.25";}
        else if(81 >= val_RA || val_RA <= 85){transmuted = "2.0";}
        else if(86 >= val_RA || val_RA <= 90){transmuted = "1.75";}
        else if(91 >= val_RA || val_RA <= 92){transmuted = "1.5";}
        else if(93 >= val_RA || val_RA <= 94){transmuted = "1.25";}
        else if(95 >= val_RA || val_RA <= 100){transmuted = "1.0";}

        RA = Double.toString(val_RA);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("RA", RA);
        intent.putExtra("transmuted", transmuted);

        startActivity(intent);
    }
}
