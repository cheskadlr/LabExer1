package com.example.cheskadelarosa.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView tv_RA, tv_FinalGrade;
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_RA = (TextView) findViewById(R.id.tvRA);
        tv_FinalGrade = (TextView) findViewById(R.id.tvFinalGrade);

        String RA = getIntent().getStringExtra("RA");
        String finalGrade = getIntent().getStringExtra("transmuted");

        tv_RA.setText("Your RA is " + RA);
        tv_FinalGrade.setText("Your final grade is " + finalGrade);
    }

    public void callMainActivity(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
