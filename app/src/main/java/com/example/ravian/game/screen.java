package com.example.ravian.game;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class screen extends Activity implements OnClickListener {
    Button level1,level2,level3,how_play;
int   enabled_False_Count=0;
    int x=0;
    MainActivity ma=new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        level1=(Button) findViewById(R.id.button1);
        level2=(Button) findViewById(R.id.button2);
        level3=(Button) findViewById(R.id.button3);
        how_play=(Button) findViewById(R.id.button4);
        level1.setOnClickListener(this);
        level2.setOnClickListener(this);
        level3.setOnClickListener(this);
        how_play.setOnClickListener(this);

    }


    public void onClick(View v){

        if(v==level1) {

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();

             int x=6;
            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("hints", x);
            spe.commit();


        }
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int mHints = sp.getInt("hints", x);



if(mHints==6) {
    if (v == level2) {

        Intent intent = new Intent(getApplicationContext(), level2.class);
        startActivity(intent);
        finish();

        int x=12;
        SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
        spe.putInt("hint", x);
        spe.commit();
    }
}


        SharedPreferences s = getPreferences(MODE_PRIVATE);
        int m = s.getInt("hint", x);
        if(m==12) {
            if (v == level3) {
                Intent intent = new Intent(getApplicationContext(), level3.class);
                startActivity(intent);
                finish();


            }
        }
            if (v == how_play) {
                Intent intent = new Intent(getApplicationContext(), howpaly.class);
                startActivity(intent);
                finish();

            }

        }
    }


