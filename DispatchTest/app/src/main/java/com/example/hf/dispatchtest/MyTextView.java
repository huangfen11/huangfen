package com.example.hf.dispatchtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by hf on 18-7-4.
 */

@SuppressLint("AppCompatCustomView")
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("OOO","MyTextView dispatchTouchEvent ev ="+Util.getActionString(event));
        return super.dispatchTouchEvent(event);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("OOO","MyTextView onTouchEvent ev ="+Util.getActionString(event));
        return super.onTouchEvent(event);
    }
}
