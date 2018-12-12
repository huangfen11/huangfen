package com.example.hf.dispatchtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("OOO","MyButton dispatchTouchEvent ev ="+Util.getActionString(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("OOO","MyButton onTouchEvent ev ="+Util.getActionString(event));
        return super.onTouchEvent(event);
    }
}
