package com.example.worldclock;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private ImageView picture1;
    private ImageView picture2;
    private ImageView picture3;
    private ImageView picture4;
    private ImageView picture5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout clock1 = findViewById(R.id.clock1);
        final TextClock sydney = clock1.findViewById(R.id.textClock);
        picture1 = clock1.findViewById(R.id.picture);
        TextView city1 = clock1.findViewById(R.id.city);
        city1.setText("Sydney");
        picture1.setImageResource(R.drawable.sydney);

        final ConstraintLayout clock2 = findViewById(R.id.clock2);
        final TextClock shanghai = clock2.findViewById(R.id.textClock);
        picture2 = clock2.findViewById(R.id.picture);
        TextView city2 = clock2.findViewById(R.id.city);
        city2.setText("Shanghai");
        picture2.setImageResource(R.drawable.shanghai);
        shanghai.setTimeZone("Asia/Shanghai");


        final ConstraintLayout clock3 = findViewById(R.id.clock3);
        final TextClock london = clock3.findViewById(R.id.textClock);
        picture3 = clock3.findViewById(R.id.picture);
        TextView city3 = clock3.findViewById(R.id.city);
        city3.setText("London");
        picture3.setImageResource(R.drawable.london);
            london.setTimeZone("Europe/London");

        final ConstraintLayout clock4 = findViewById(R.id.clock4);
        final TextClock warsaw = clock4.findViewById(R.id.textClock);
        picture4 = clock4.findViewById(R.id.picture);
        TextView city4 = clock4.findViewById(R.id.city);
        city4.setText("Warsaw");
        picture4.setImageResource(R.drawable.warsaw);
            warsaw.setTimeZone("Europe/Warsaw");

        final ConstraintLayout clock5 = findViewById(R.id.clock5);
        final TextClock newYork = clock5.findViewById(R.id.textClock);
        picture5 = clock5.findViewById(R.id.picture);
        TextView city5 = clock5.findViewById(R.id.city);
        city5.setText("New York");
        picture5.setImageResource(R.drawable.newy);
            newYork.setTimeZone("America/New_York");


        clock1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock1.setVisibility(View.GONE);
            }
        });
        clock2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock2.setVisibility(View.GONE);
            }
        });
        clock3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock3.setVisibility(View.GONE);
            }
        });
        clock4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock4.setVisibility(View.GONE);
            }
        });
        clock5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock5.setVisibility(View.GONE);
            }
        });
        final Button button = findViewById(R.id.show);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clock2.setVisibility(View.VISIBLE);
                clock1.setVisibility(View.VISIBLE);
                clock3.setVisibility(View.VISIBLE);
                clock4.setVisibility(View.VISIBLE);
                clock5.setVisibility(View.VISIBLE);
            }
        });

        Switch sw = (Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sydney.setFormat12Hour("kk:mm");
                    shanghai.setFormat12Hour("kk:mm");
                    warsaw.setFormat12Hour("kk:mm");
                    london.setFormat12Hour("kk:mm");
                    newYork.setFormat12Hour("kk:mm");

                } else {
                    sydney.setFormat12Hour("h:mm a");
                    shanghai.setFormat12Hour("h:mm a");
                    warsaw.setFormat12Hour("h:mm a");
                    london.setFormat12Hour("h:mm a");
                    newYork.setFormat12Hour("h:mm a");
                }
            }
        });
    }
}
