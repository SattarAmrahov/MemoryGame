package com.example.user.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et;
        et = (EditText)findViewById(R.id.editText_name);

        ((Button)findViewById(R.id.button_start)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CardScreen.class);
                i.putExtra("name", et.getText().toString());
                startActivity(i);
            }
        });

    }
}
