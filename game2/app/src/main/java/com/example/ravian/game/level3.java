package com.example.ravian.game;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class level3 extends AppCompatActivity {
    TextView[] tv = new TextView[18];
    Button start_Button,b;
    String[] text = new String[18];
    int[] Count = new int[18];
    int count;
    String[] temp = new String[2];
    int[] save_Index = new int[2];

    Handler myHandler;

    int enabled_False_Count ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        tv[0] = (TextView) findViewById(R.id.tv1);
        tv[1] = (TextView) findViewById(R.id.tv2);
        tv[2] = (TextView) findViewById(R.id.tv3);
        tv[3] = (TextView) findViewById(R.id.tv4);
        tv[4] = (TextView) findViewById(R.id.tv5);
        tv[5] = (TextView) findViewById(R.id.tv6);
        tv[6] = (TextView) findViewById(R.id.tv7);
        tv[7] = (TextView) findViewById(R.id.tv8);
        tv[8] = (TextView) findViewById(R.id.tv9);
        tv[9] = (TextView) findViewById(R.id.tv10);
        tv[10] = (TextView) findViewById(R.id.tv11);
        tv[11] = (TextView) findViewById(R.id.tv12);
        tv[12] = (TextView) findViewById(R.id.tv13);
        tv[13] = (TextView) findViewById(R.id.tv14);
        tv[14] = (TextView) findViewById(R.id.tv15);
        tv[15] = (TextView) findViewById(R.id.tv16);
        tv[16] = (TextView) findViewById(R.id.tv17);
        tv[17] = (TextView) findViewById(R.id.tv18);
        for(int i=0; i<18; i++)
        {
            text[i] = tv[i].getText().toString();
            tv[i].setText("");
            Count[i]=0;

        }

        enabled_False_Count = 0;
        count = 0;
        start_Button = (Button) findViewById(R.id.start_btn);
        b=(Button)findViewById(R.id.b3);
        myHandler = new Handler();
    }
    public void mind_Game(View view)
    {
        switch(view.getId()) {

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
            case R.id.tv7:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[6]++;
                count++;
                break;
            case R.id.tv8:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[7]++;
                count++;
                break;
            case R.id.tv9:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[8]++;
                count++;
                break;
            case R.id.tv10:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[9]++;
                count++;
                break;
            case R.id.tv11:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[10]++;
                count++;
                break;
            case R.id.tv12:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[11]++;
                count++;
                break;
            case R.id.tv13:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[12]++;
                count++;
                break;
            case R.id.tv14:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[13]++;
                count++;
                break;
            case R.id.tv15:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[14]++;
                count++;
                break;
            case R.id.tv16:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[15]++;
                count++;
                break;
            case R.id.tv17:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[16]++;
                count++;
                break;
            case R.id.tv18:
                //Toast.makeText(this, "Debugging" , Toast.LENGTH_SHORT).show();
                Count[17]++;
                count++;
                break;
            default:
                Toast.makeText(this, "Please Click on button or any TextView", Toast.LENGTH_SHORT).show();

        }//End of Switch

        if(count > 1)
        {
            // Toast.makeText(this, "Debugging Count>1" , Toast.LENGTH_SHORT).show();

            for (int i=0,j=0; i < 18; i++)
            {
                if(Count[i] == 1)
                {
                    //Toast.makeText(this, "Debugging Count[i]==1" , Toast.LENGTH_SHORT).show();
                    save_Index[j] = i;
                    temp[j] = text[i];
                    j++;
                }

            }


            if(temp[0].equalsIgnoreCase(temp[1]))
            {
                Toast.makeText(this, "Correct Selection!!! " + temp[0] + " : " + temp [1], Toast.LENGTH_SHORT).show();
                //  Toast.makeText(this, "Correct Selection!!!", Toast.LENGTH_SHORT).show();

                enabled_False_Count+=2;
                tv[save_Index[0]].setText(text[save_Index[0]]);
                //tv[save_Index[0]].setEnabled(true);
                tv[save_Index[0]].setBackgroundColor(Color.GREEN);
                tv[save_Index[0]].setClickable(false);


                tv[save_Index[1]].setText(text[save_Index[1]]);
                tv[save_Index[1]].setBackgroundColor(Color.GREEN);
                tv[save_Index[1]].setClickable(false);

                if(enabled_False_Count == 18)
                    Game_Over();
            }

            else
            {
                tv[save_Index[0]].setClickable(true);
                tv[save_Index[1]].setText("");
                tv[save_Index[1]].setClickable(true);
                tv[save_Index[0]].setText("");
                Toast.makeText(this, "InCorrect Selection!!! Please Select Again", Toast.LENGTH_SHORT).show();
            }

            Initialise();

        } //End of if(count>1)

        else if(count==1)
        {
            for (int i=0; i < 18; i++)
            {
                if(Count[i] == 1)                  //when button click
                {
                    tv[i].setClickable(false);
                    tv[i].setText(""+text[i]);
                    break;
                }

            }

        }
//
    }
    public void Game_Over()
    {
        Toast toast= Toast.makeText(this, "Level 3 Complete!!!", Toast.LENGTH_SHORT);
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

        for (int i=0; i < 18; i++)
        {

            Count[i] = 0;
        }

        //Try to create user defined function "setRandomText()" which initialises all the textviews by random numbers
        //for New Game...
    }

    public void Initialise()
    {
        count = 0;
        for (int i = 0; i < 18; i++)
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

        tv[6].setText("4");
        text[6] = tv[6].getText().toString();

        tv[7].setText("5");
        text[7] = tv[7].getText().toString();

        tv[8].setText("6");
        text[8] = tv[8].getText().toString();

        tv[9].setText("6");
        text[9] = tv[9].getText().toString();

        tv[10].setText("5");
        text[10] = tv[10].getText().toString();

        tv[11].setText("4");
        text[11] = tv[11].getText().toString();

        tv[12].setText("7");
        text[12] = tv[12].getText().toString();

        tv[13].setText("8");
        text[13] = tv[13].getText().toString();

        tv[14].setText("9");
        text[14] = tv[14].getText().toString();

        tv[15].setText("9");
        text[15] = tv[15].getText().toString();

        tv[16].setText("8");
        text[16] = tv[16].getText().toString();

        tv[17].setText("7");
        text[17] = tv[17].getText().toString();
//Below handler will delay the program for one second...
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<18; i++)
                {
                    tv[i].setClickable(true);
                    tv[i].setText("");
                }
            }
        }, 100);

 /*        try
        {
            Thread t = Thread.currentThread();
            t.sleep(1000);

           // SystemClock.sleep(1000);
        }

        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
*/
/*        Toast.makeText(this, "Debugging!!!" + tv[0].getText().toString()
                                            + tv[1].getText().toString()
                                            + tv[2].getText().toString()
                                            + tv[3].getText().toString()
                                            + tv[4].getText().toString()
                                            + tv[5].getText().toString() , Toast.LENGTH_SHORT).show();
*/
        start_Button.setEnabled(false);
    }
    public void back1(View v)
    {
        if(v==b) {
            Intent intent = new Intent(getApplicationContext(), screen.class);
            startActivity(intent);
            finish();
        }
    }


}
