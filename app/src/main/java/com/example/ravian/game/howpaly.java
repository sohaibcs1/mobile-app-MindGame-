package com.example.ravian.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class howpaly extends AppCompatActivity {
        Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howpaly);
        b1=(Button) findViewById(R.id.back4);

    }
    public void ba(View v){
        if(v==b1){
            Intent intent = new Intent(getApplicationContext(),screen.class);
            startActivity(intent);
            finish();
        }
    }
}
