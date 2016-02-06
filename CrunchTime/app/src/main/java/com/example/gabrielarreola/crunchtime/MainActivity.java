package com.example.gabrielarreola.crunchtime;

import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    public static double conversionNum = 0;
    public static double[] conversions;
    public static double calsBurned = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageButton imageButtonPushUp = (ImageButton) findViewById(R.id.imageButtonPushUps);

        imageButtonPushUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 350.0;
            }
        });

        ImageButton imageButtonSitUp = (ImageButton) findViewById(R.id.imageButtonSitUp);

        imageButtonSitUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 200.0;
            }
        });

        ImageButton imageButtonSquats = (ImageButton) findViewById(R.id.imageButtonSquat);

        imageButtonSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 225.0;
            }
        });

        ImageButton imageButtonLegLift = (ImageButton) findViewById(R.id.imageButtonLegLift);

        imageButtonLegLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 25.0;
            }
        });

        ImageButton imageButtonPlank = (ImageButton) findViewById(R.id.imageButtonPlank);

        imageButtonPlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 25.0;
            }
        });

        ImageButton imageButtonJumpingJacks = (ImageButton) findViewById(R.id.imageButtonJumpingJacks);

        imageButtonJumpingJacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 10.0;
            }
        });

        ImageButton imageButtonPullUps = (ImageButton) findViewById(R.id.imageButtonPullUp);

        imageButtonPullUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 100.0;
            }
        });

        ImageButton imageButtonCycling = (ImageButton) findViewById(R.id.imageButtonCycling);


        imageButtonCycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 12.0;
            }
        });

        ImageButton imageButtonWalking = (ImageButton) findViewById(R.id.imageButtonWalking);

        imageButtonWalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 20.0;
            }
        });

        ImageButton imageButtonJogging = (ImageButton) findViewById(R.id.imageButtonJogging);

        imageButtonJogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 12.0;
            }
        });

        ImageButton imageButtonSwimming = (ImageButton) findViewById(R.id.imageButtonSwimming);

        imageButtonSwimming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 13.0;
            }
        });

        ImageButton imageButtonStairClimbing = (ImageButton) findViewById(R.id.imageButtonStairClimbing);

        imageButtonStairClimbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversionNum = 15.0;
            }
        });

        Button buttonConvert = (Button) findViewById(R.id.Convert);

        final EditText editInputNum = (EditText) findViewById(R.id.NumberInput);
        //editInputNum.setRawInputType(Configuration.KEYBOARD_12KEY);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int time = Integer.valueOf(editInputNum.getText().toString());
                calsBurned = convert(time, conversionNum);
                conversions = convertAll(calsBurned);
                Intent intent = new Intent(MainActivity.this, Results.class);
                intent.putExtra("calories burned", calsBurned);
                intent.putExtra("conversion", conversions);
                startActivity(intent);
            }
        });
    }

        public double[] convertAll(double calories) {
            double[] eArray = new double[12];
            eArray[0] = 350.0 * calories / 100.0;
            eArray[1] = 200.0 * calories / 100.0;
            eArray[2] = 225.0 * calories / 100.0;
            eArray[3] = 25.0 * calories / 100.0;
            eArray[4] = 25.0 * calories / 100.0;
            eArray[5] = 10.0 * calories / 100.0;
            eArray[6] = 100.0 * calories / 100.0;
            eArray[7] = 12.0 * calories / 100.0;
            eArray[8] = 20.0 * calories / 100.0;
            eArray[9] = 12.0 * calories / 100.0;
            eArray[10] = 13.0 * calories / 100.0;
            eArray[11] = 15.0 * calories / 100.0;
            return eArray;
        }

        public double convert(int time, double conversion) {
            return (100.0 / conversion) * time;
        }
    //enter code here


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
