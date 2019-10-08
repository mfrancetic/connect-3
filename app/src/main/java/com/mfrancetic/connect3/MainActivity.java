package com.mfrancetic.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button playAgainButton;

    private TextView messageTextView;

    private int redTag = 1;

    private int yellowTag = 0;

    // 0: yellow, 1: red
    int activePlayer = 0;

    boolean gameActive = true;

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playAgainButton = findViewById(R.id.play_again_button);
        messageTextView = findViewById(R.id.information_text_view);

        playAgainButton.setVisibility(View.INVISIBLE);
        messageTextView.setVisibility(View.INVISIBLE);
    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameActive) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1500);

            if (activePlayer == yellowTag) {
                counter.setImageResource(R.drawable.banana);
                activePlayer = redTag;
            } else {
                counter.setImageResource(R.drawable.cherry);
                activePlayer = yellowTag;
            }

            counter.animate().translationYBy(1500).rotation(3600).setDuration(300);

            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]]
                        && gameState[winningPosition[1]] == gameState[winningPosition[2]]
                        && gameState[winningPosition[0]] != 2) {

                    gameActive = false;
                    String winner = "";
                    if (activePlayer == 1) {
                        winner = getString(R.string.yellow);
                    } else {
                        winner = getString(R.string.red);
                    }
                    Toast.makeText(this, winner + " " + getString(R.string.has_won), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}