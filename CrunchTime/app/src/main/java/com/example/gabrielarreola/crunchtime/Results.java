package com.example.gabrielarreola.crunchtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String message = "IT DIDN'T WORK, YOU'RE STILL UNFIT";
        String pushUp = "";
        String sitUp = "";
        String squat = "";
        String legLift = "";
        String plank = "";
        String jumpingJacks = "";
        String pullUp = "";
        String cycling = "";
        String walking = "";
        String jogging = "";
        String swimming = "";
        String stairClimbing = "";

        Intent intended = getIntent();
        Bundle b = intended.getExtras();
        if (b!= null) {
            double caloriesBurned = (double) b.get("calories burned");
            double[] converted = (double[]) b.get("conversion");
            message = "You burned " + String.valueOf(caloriesBurned) + " calories! Equivalent to:";
            pushUp = String.valueOf(converted[0]) + " reps of push ups";
            sitUp = String.valueOf(converted[1]) + " reps of sit ups";
            squat = String.valueOf(converted[2]) + " reps of squats";
            legLift = String.valueOf(converted[3]) + " min of leg lifts";
            plank = String.valueOf(converted[4]) + " min of planking";
            jumpingJacks = String.valueOf(converted[5]) + " min of jumping jacks";
            pullUp = String.valueOf(converted[6]) + " reps of pull ups";
            cycling = String.valueOf(converted[7]) + " min of cycling";
            walking = String.valueOf(converted[8]) + " min of walking";
            jogging = String.valueOf(converted[9]) + " min of jogging";
            swimming = String.valueOf(converted[10]) + " min of swimming";
            stairClimbing = String.valueOf(converted[11]) + " min of stair climbing";


        }

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

        TextView push = (TextView) findViewById(R.id.textView);
        push.setText(pushUp);
        TextView sit = (TextView) findViewById(R.id.textView2);
        sit.setText(sitUp);
        TextView squa = (TextView) findViewById(R.id.textView3);
        squa.setText(squat);
        TextView leg = (TextView) findViewById(R.id.textView4);
        leg.setText(legLift);

        TextView pla = (TextView) findViewById(R.id.textView5);
        pla.setText(plank);
        TextView jump = (TextView) findViewById(R.id.textView6);
        jump.setText(jumpingJacks);
        TextView pull = (TextView) findViewById(R.id.textView7);
        pull.setText(pullUp);
        TextView cycle = (TextView) findViewById(R.id.textView8);
        cycle.setText(cycling);
        TextView walk = (TextView) findViewById(R.id.textView9);
        walk.setText(walking);
        TextView jog = (TextView) findViewById(R.id.textView10);
        jog.setText(jogging);
        TextView swim = (TextView) findViewById(R.id.textView11);
        swim.setText(swimming);
        TextView stair = (TextView) findViewById(R.id.textView12);
        stair.setText(stairClimbing);


        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Results.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
