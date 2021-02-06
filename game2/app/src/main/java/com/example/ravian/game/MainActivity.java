package com.example.ravian.game;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.session.MediaController;

import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {


    Button back;
    TextView[] tv = new TextView[6];
    Button start_Button;
    String[] text = new String[6];
    int[] Count = new int[6];
    int count;
    String[] temp = new String[2];
    int[] save_Index = new int[2];

    Handler myHandler;

    int enabled_False_Count ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv[0] = (TextView) findViewById(R.id.tv1);
        tv[1] = (TextView) findViewById(R.id.tv2);
        tv[2] = (TextView) findViewById(R.id.tv3);
        tv[3] = (TextView) findViewById(R.id.tv4);
        tv[4] = (TextView) findViewById(R.id.tv5);
        tv[5] = (TextView) findViewById(R.id.tv6);

        for(int i=0; i<6; i++)
        {

            text[i] = tv[i].getText().toString();         //before start button
            tv[i].setText("");
            Count[i]=0;

        }

        enabled_False_Count = 0;
        count = 0;
        start_Button = (Button) findViewById(R.id.start_btn);
        back=(Button) findViewById(R.id.b);

        myHandler = new Handler();
    }

        public void mind_Game (View view){

                switch (view.getId()) {

            case R.id.start_btn:
             start_Button_Clicked();
                //break;
                return;

            case R.id.tv1:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[0]++;
                count++;
                break;

            case R.id.tv2:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[1]++;
                count++;
                break;

            case R.id.tv3:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[2]++;
                count++;
                break;

            case R.id.tv4:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[3]++;
                count++;
                break;

            case R.id.tv5:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[4]++;
                count++;
                break;

            case R.id.tv6:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[5]++;
                count++;
                break;

            default:
                Toast.makeText(this, "Please Click on button or any TextView", Toast.LENGTH_SHORT).show();

        }//End of Switch

        if (count > 1) {
            // Toast.makeText(this, "Debugging Count>1" , Toast.LENGTH_SHORT).show();

            for (int i = 0, j = 0; i < 6; i++) {

                if (Count[i] == 1) {
                    //Toast.makeText(this, "Debugging Count[i]==1" , Toast.LENGTH_SHORT).show();
                    save_Index[j] = i;
                    temp[j] = text[i];
                    j++;

                }

            }


            if (temp[0].equalsIgnoreCase(temp[1])) {
                Toast.makeText(this, "Correct Selection!!! " + temp[0] + " : " + temp[1], Toast.LENGTH_SHORT).show();
                //  Toast.makeText(this, "Correct Selection!!!", Toast.LENGTH_SHORT).show();

                enabled_False_Count += 2;
                tv[save_Index[0]].setText(text[save_Index[0]]);
                //tv[save_Index[0]].setEnabled(true);
                tv[save_Index[0]].setBackgroundColor(Color.GREEN);
                tv[save_Index[0]].setClickable(false);


                tv[save_Index[1]].setText(text[save_Index[1]]);
                tv[save_Index[1]].setBackgroundColor(Color.GREEN);
                tv[save_Index[1]].setClickable(false);

                if (enabled_False_Count == 6) {

                    Game_Over();
                }
            } else {
                tv[save_Index[0]].setClickable(true);
                tv[save_Index[1]].setText("");
                tv[save_Index[1]].setClickable(true);
                tv[save_Index[0]].setText("");
                Toast.makeText(this, "InCorrect Selection!!! Please Select Again", Toast.LENGTH_SHORT).show();
            }

            Initialise();

        } //End of if(count>1)

        else if (count == 1) {
            for (int i = 0; i < 6; i++) {
                if (Count[i] == 1)                  //when button click
                {
                    tv[i].setClickable(false);
                    tv[i].setText("" + text[i]);

                    break;

                }


            }

        }
//
    }



    public void Game_Over()
    {

       Toast toast= Toast.makeText(this, "Level 1 Complete!!!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER , 0, 0);
        toast.show();
        Initialise_All();

    }

    public void Initialise_All()
    {
        count = 0;
        enabled_False_Count = 0;
        temp[0] = null;
        temp[1] = null;
        save_Index[0] = 0;
        save_Index[1] = 0;
        start_Button.setEnabled(true);

        for (int i=0; i < 6; i++)
        {
            Count[i] = 0;
        }

        //Try to create user defined function "setRandomText()" which initialises all the textviews by random numbers
        //for New Game...
    }

    public void Initialise()
    {
        count = 0;
        for (int i = 0; i < 6; i++)
        {
            Count[i] = 0;
        }

    }

    public void start_Button_Clicked()
    {

        tv[0].setText("1");
        text[0] = tv[0].getText().toString();

       // tv[0].setVisibility(View.VISIBLE);


        tv[1].setText("2");
        text[1] = tv[1].getText().toString();

        tv[2].setText("3");
        text[2] = tv[2].getText().toString();

        tv[3].setText("3");
        text[3] = tv[3].getText().toString();

        tv[4].setText("2");
        text[4] = tv[4].getText().toString();

        tv[5].setText("1");
        text[5] = tv[5].getText().toString();

//Below handler will delay the program for one second...
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<6; i++)
                {
                    tv[i].setClickable(true);
                    tv[i].setText("");
                }
            }
        }, 100);

//        try
//        {
//            Thread t = Thread.currentThread();
//            t.sleep(1000);
//
//           // SystemClock.sleep(1000);
//        }
//
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }

/*        Toast.makeText(this, "Debugging!!!" + tv[0].getText().toString()
                                            + tv[1].getText().toString()
                                            + tv[2].getText().toString()
                                            + tv[3].getText().toString()
                                            + tv[4].getText().toString()
                                            + tv[5].getText().toString() , Toast.LENGTH_SHORT).show();
*/
        start_Button.setEnabled(false);
    }

    public void back(View v)
{
        if(v==back) {
        Intent intent = new Intent(getApplicationContext(), screen.class);
        startActivity(intent);
        finish();
        }
        }
        }