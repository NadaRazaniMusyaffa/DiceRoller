package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import  java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollDice() {
        Random rand = new Random();
        int Dice = rand.nextInt(6);
        ImageView diceImg = findViewById(R.id.imageView);

        switch (Dice) {
            case 1:
                diceImg.setImageResource(R.drawable.dice_1);
            case 2:
                diceImg.setImageResource(R.drawable.dice_2);
            case 3:
                diceImg.setImageResource(R.drawable.dice_3);
            case 4:
                diceImg.setImageResource(R.drawable.dice_4);
            case 5:
                diceImg.setImageResource(R.drawable.dice_5);
            default:
                diceImg.setImageResource(R.drawable.dice_6);

                break;
        }
    }

    public void onButtonClick(View view) {
        rollDice();
    }
}

