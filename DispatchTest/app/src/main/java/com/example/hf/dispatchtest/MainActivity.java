package com.example.hf.dispatchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("OOO","Activity dispatchTouchEvent ev ="+Util.getActionString(ev));
        return super.dispatchTouchEvent(ev);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("OOO","Activity onTouchEvent ev ="+Util.getActionString(event));
        return super.onTouchEvent(event);

    }
}
