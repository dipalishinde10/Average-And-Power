package com.example.averagepower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText T1=(EditText) findViewById(R.id.num1);
        EditText T2=(EditText) findViewById(R.id.num2);
        TextView Result=(TextView) findViewById(R.id.textView1);
        TextView Result1=(TextView) findViewById(R.id.textView2);
        Button B1=(Button) findViewById(R.id.btn1);
        Button B2=(Button) findViewById(R.id.btn2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2;
                n1=Integer.parseInt(T1.getText().toString().trim());
                n2=Integer.parseInt(T2.getText().toString().trim());
                int Average=(n1+n2)/2;
                Result.setText("Average of"+n1+"and"+n2+"is"+Average);
                Toast.makeText(MainActivity.this,"Average is"+Average,Toast.LENGTH_SHORT).show();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2;
                n1=Integer.parseInt(T1.getText().toString().trim());
                n2=Integer.parseInt(T2.getText().toString().trim());
                double power=Math.pow(n1,n2);
                Result1.setText("power of"+n1+"and"+n2+"is"+power);
                Toast.makeText(MainActivity.this,"power is"+power,Toast.LENGTH_SHORT).show();

            }
        });


    }
}