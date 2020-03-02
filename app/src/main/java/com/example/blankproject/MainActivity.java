package com.example.blankproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    int count = 0;
    Button btn1,btn2;
    TextView tvname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        tvname=findViewById(R.id.tvname);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                count ++;
//                tvname.setText(""+count);
//
//            }
//        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void count (View view){
        count++;
        tvname.setText(""+count);
        Log.d(TAG,"onclick: "+count);
        //int x = 10/0;

    }
}
