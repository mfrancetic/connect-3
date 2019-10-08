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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playAgainButton = findViewById(R.id.play_again_button);
        messageTextView = findViewById(R.id.information_text_view);

        playAgainButton.setVisibility(View.INVISIBLE);
        messageTextView.setVisibility(View.INVISIBLE);
    }

    public void setImage(View view) {
        int id = view.getId();
        ImageView imageView = findViewById(id);
        imageView.setImageResource(R.drawable.banana);
    }
}
