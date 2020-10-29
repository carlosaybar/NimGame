package com.example.nimgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import java.io.*;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    protected int originalNumber = rand.nextInt(50);
    Button start;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button next;
    public boolean Turn = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.Next);
        start = findViewById(R.id.startBtn);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((Button)v).setText(String.valueOf(originalNumber));
            }
        });
        user();

    }



    public void user()
    {

        start.setText(String.valueOf(originalNumber));
            button1 = findViewById(R.id.Second);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(originalNumber -1 >= 0)
                    {
                        originalNumber = originalNumber - 1;
                        start.setText(String.valueOf(originalNumber));
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        next.setEnabled(true);
                        if(originalNumber == 0)
                        {
                            win();
                        }
                        else
                        {
                            Turn = false;
                            //change the color of the button or the number displayed
                            // to make it clear whose turn it is.
                            start.setBackgroundColor(Color.RED);
                            computer();

                        }

                    }
                    else
                    {
                        notAllowed();
                       //create a method that displays a toas that says not allowed
                        //call the method inside this else statement.
                    }






                }
            });



            button2 = findViewById(R.id.third);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(originalNumber -2 >= 0)
                    {
                        originalNumber = originalNumber - 2;
                        start.setText(String.valueOf(originalNumber));
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        next.setEnabled(true);
                        if(originalNumber == 0)
                        {
                            win();
                        }
                        else
                        {
                            Turn = false;
                            start.setBackgroundColor(Color.RED);
                            computer();
                        }

                    }
                    else
                    {
                        notAllowed();
                        //create a method that displays a toas that says not allowed
                        //call the method inside this else statement.
                    }
                }
            });

            button3 = findViewById(R.id.fourth);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(originalNumber -3 >= 0)
                    {
                        originalNumber = originalNumber - 3;
                        start.setText(String.valueOf(originalNumber));
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        next.setEnabled(true);
                        if(originalNumber == 0)
                        {
                            win();
                        }
                        else
                        {
                            Turn = false;
                            start.setBackgroundColor(Color.RED);
                            computer();
                        }

                    }
                    else
                    {
                        notAllowed();
                        //create a method that displays a toas that says not allowed
                        //call the method inside this else statement.
                    }
                }
            });

            button4 = findViewById(R.id.five);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(originalNumber -4 >= 0)
                    {
                        originalNumber = originalNumber - 4;
                        start.setText(String.valueOf(originalNumber));
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        next.setEnabled(true);
                        if(originalNumber == 0)
                        {
                            win();
                        }
                        else
                        {
                            Turn = false;
                            start.setBackgroundColor(Color.RED);
                            computer();
                        }

                    }
                    else
                    {
                        notAllowed();
                        //create a method that displays a toas that says not allowed
                        //call the method inside this else statement.
                    }
                }
            });

            button5 = findViewById(R.id.six);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(originalNumber -5 >= 0)
                    {
                        originalNumber = originalNumber - 5;
                        start.setText(String.valueOf(originalNumber));
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        next.setEnabled(true);
                        if(originalNumber == 0)
                        {
                            win();
                        }
                        else
                        {
                            Turn = false;
                            start.setBackgroundColor(Color.RED);
                            computer();
                        }

                    }
                    else
                    {
                        notAllowed();
                        //create a method that displays a toas that says not allowed
                        //call the method inside this else statement.
                    }

                }
            });

            //computer();
/*
        Button next = findViewById(R.id.Next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computer();
                Turn = true;
            }
        });
*/





    }

    public void computer()
    {

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int computer = (int)(Math.random()*5)+1;
                if(originalNumber - computer >= 0)
                {
                    originalNumber = originalNumber - computer;
                    start.setText(String.valueOf(originalNumber));
                    next.setEnabled(false);
                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                    button5.setEnabled(true);
                    if(originalNumber == 0)
                    {
                        win();
                    }
                    else
                    {
                        Turn = true;
                        start.setBackgroundColor(Color.GREEN);
                    }

                }
                else
                {
                    Random random = new Random();
                    computer = (int)(Math.random()*originalNumber)+1;
                    originalNumber = originalNumber - computer;
                    start.setText(String.valueOf(originalNumber));
                    next.setEnabled(false);
                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                    button5.setEnabled(true);
                    if(originalNumber == 0)
                    {
                        win();
                    }
                    else
                    {
                        Turn = true;
                        start.setBackgroundColor(Color.GREEN);
                    }
                }

            }
        });
    }
    /**
     * this method displays a "Try again" message to the user
     * and clears the board for the user to play again
     */
    private void win() {
        if(Turn)
        {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            // starts the activity connected to the specified class
            startActivity(intent);
            next.setEnabled(false);
        }
        else
        {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);

            // starts the activity connected to the specified class
            startActivity(intent);
            next.setEnabled(false);

        }

    }

    public void notAllowed()
    {
        Toast.makeText(this,  "not allowed!", Toast.LENGTH_SHORT).show();
    }




}