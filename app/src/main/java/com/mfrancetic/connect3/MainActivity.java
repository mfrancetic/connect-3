package com.mfrancetic.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button playAgainButton;

    private TextView messageTextView;

    private int redTag = 1;

    private int yellowTag = 2;

    private String yellowTagString = "2";

    private String redTagString = "1";

    private ImageView imageView00;

    private ImageView imageView01;

    private ImageView imageView02;

    private ImageView imageView10;

    private ImageView imageView11;

    private ImageView imageView12;

    private ImageView imageView20;

    private ImageView imageView21;

    private ImageView imageView22;

    String imageView00TagString;

    String imageView01TagString;

    String imageView02TagString;

    int imageView00Tag;

    int imageView01Tag;

    int imageView02Tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playAgainButton = findViewById(R.id.play_again_button);
        messageTextView = findViewById(R.id.information_text_view);

        imageView00 = findViewById(R.id.grid_image_view_0_0);
        imageView01 = findViewById(R.id.grid_image_view_0_1);
        imageView02 = findViewById(R.id.grid_image_view_0_2);
        imageView10 = findViewById(R.id.grid_image_view_1_0);
        imageView11 = findViewById(R.id.grid_image_view_1_1);
        imageView12 = findViewById(R.id.grid_image_view_1_2);
        imageView20 = findViewById(R.id.grid_image_view_2_0);
        imageView21 = findViewById(R.id.grid_image_view_2_1);
        imageView22 = findViewById(R.id.grid_image_view_2_2);


        playAgainButton.setVisibility(View.INVISIBLE);
        messageTextView.setVisibility(View.INVISIBLE);
    }

    public void setImage(View view) {
        int id = view.getId();
        ImageView imageView = findViewById(id);
        imageView.setTag(id, yellowTag);
        imageView.setImageResource(R.drawable.banana);
        checkIfGameOver();
    }

    public void checkIfGameOver() {
        if (imageView00.getTag(imageView00.getId()) != null &&
                imageView01.getTag(imageView01.getId()) != null &&
                imageView02.getTag(imageView02.getId()) != null) {
            if (imageView00.getTag(imageView00.getId()).equals(yellowTag) &&
                    imageView01.getTag(imageView01.getId()).equals(yellowTag) &&
                    imageView02.getTag(imageView02.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView00.getTag(imageView00.getId()).equals(redTag) &&
                    imageView01.getTag(imageView01.getId()).equals(redTag) &&
                    imageView02.getTag(imageView02.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }

        } else if (imageView10.getTag(imageView10.getId()) != null &&
                imageView11.getTag(imageView11.getId()) != null &&
                imageView12.getTag(imageView12.getId()) != null) {
            if (imageView10.getTag(imageView10.getId()).equals(yellowTag) &&
                    imageView11.getTag(imageView11.getId()).equals(yellowTag) &&
                    imageView12.getTag(imageView12.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView10.getTag(imageView10.getId()).equals(redTag) &&
                    imageView11.getTag(imageView11.getId()).equals(redTag) &&
                    imageView12.getTag(imageView12.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }
        } else if (imageView20.getTag(imageView20.getId()) != null &&
                imageView21.getTag(imageView21.getId()) != null &&
                imageView22.getTag(imageView22.getId()) != null) {
            if (imageView20.getTag(imageView20.getId()).equals(yellowTag) &&
                    imageView21.getTag(imageView21.getId()).equals(yellowTag) &&
                    imageView22.getTag(imageView22.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView20.getTag(imageView20.getId()).equals(redTag) &&
                    imageView21.getTag(imageView21.getId()).equals(redTag) &&
                    imageView22.getTag(imageView22.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }
        } else if (imageView00.getTag(imageView00.getId()) != null &&
                imageView11.getTag(imageView11.getId()) != null &&
                imageView22.getTag(imageView22.getId()) != null) {
            if (imageView00.getTag(imageView00.getId()).equals(yellowTag) &&
                    imageView11.getTag(imageView11.getId()).equals(yellowTag) &&
                    imageView22.getTag(imageView22.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView00.getTag(imageView00.getId()).equals(redTag) &&
                    imageView11.getTag(imageView11.getId()).equals(redTag) &&
                    imageView22.getTag(imageView22.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }
        } else if (imageView02.getTag(imageView02.getId()) != null &&
                imageView11.getTag(imageView11.getId()) != null &&
                imageView20.getTag(imageView20.getId()) != null) {
            if (imageView02.getTag(imageView02.getId()).equals(yellowTag) &&
                    imageView11.getTag(imageView11.getId()).equals(yellowTag) &&
                    imageView20.getTag(imageView20.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView02.getTag(imageView02.getId()).equals(redTag) &&
                    imageView11.getTag(imageView11.getId()).equals(redTag) &&
                    imageView20.getTag(imageView20.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }
        } else if (imageView01.getTag(imageView01.getId()) != null &&
                imageView11.getTag(imageView11.getId()) != null &&
                imageView21.getTag(imageView21.getId()) != null) {
            if (imageView01.getTag(imageView01.getId()).equals(yellowTag) &&
                    imageView11.getTag(imageView11.getId()).equals(yellowTag) &&
                    imageView21.getTag(imageView21.getId()).equals(yellowTag)) {
                showMessage(getString(R.string.yellow));
            } else if (imageView01.getTag(imageView01.getId()).equals(redTag) &&
                    imageView11.getTag(imageView11.getId()).equals(redTag) &&
                    imageView21.getTag(imageView21.getId()).equals(redTag)) {
                showMessage(getString(R.string.red));
            }
        }
    }



    private void showMessage(String winner) {
        messageTextView.setVisibility(View.VISIBLE);
        String message = winner + " " + getString(R.string.has_won);
        messageTextView.setText(message);
        playAgainButton.setVisibility(View.VISIBLE);
        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

    }
}