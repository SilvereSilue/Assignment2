package com.example.testcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int BgColor1 = Color.parseColor("#ffcc0000");
                    b1.setBackgroundColor(BgColor1);
                    b1.setText("STOP!!");
                    b1.setVisibility(v.INVISIBLE);
                    b2.setVisibility(v.VISIBLE);

                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int BgColor1 = Color.parseColor("#ff99cc00");
                    b2.setBackgroundColor(BgColor1);
                    b2.setText("GO!!");
                    b2.setVisibility(v.INVISIBLE);
                    b3.setVisibility(v.VISIBLE);

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int BgColor1 = Color.parseColor("#ffffbb33");
                    b3.setBackgroundColor(BgColor1);
                    b3.setText("WAIT!!");
                    b3.setVisibility(v.INVISIBLE);
                    b1.setVisibility(v.VISIBLE);
                }
            });




    }
}
