package com.example.user.memorygame;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatDrawableManager;


public class Card extends AppCompatButton {
    boolean isOpen = false;
    int pictureId;
    int backgroundId;

    public Card(Context context) {
        super(context);
        backgroundId = R.drawable.target_red;
        @SuppressLint("RestrictedApi") Drawable d = AppCompatDrawableManager.get().getDrawable(context, backgroundId);
        setBackground(d);
    }

}
