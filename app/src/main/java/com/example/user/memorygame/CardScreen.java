package com.example.user.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

public class CardScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_screen);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        TextView tv = (TextView)findViewById(R.id.textView_name);
        tv.setText(name);

        GridLayout gl = (GridLayout)findViewById(R.id.cards);
        for (int a = 0; a < 16; a++) {
            gl.addView(new Card(this));
        }

    }
}
