package com.example.hf.dispatchtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MyViewGroup extends ViewGroup {

    private Context mContetx;

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContetx = context;
        init();
    }


    private void init() {
        MyTextView myTextView = new MyTextView(mContetx);
        myTextView.setText("this is first textView");
        myTextView.setBackgroundColor(Color.BLUE);
        addView(myTextView);

        MyButton button = new MyButton(mContetx);
        button.setText("Button");
        button.setBackgroundColor(Color.RED);
        addView(button);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            //child.measure(100,100);
            //child.measure(MeasureSpec.makeMeasureSpec(600, MeasureSpec.AT_MOST), MeasureSpec.makeMeasureSpec(600, MeasureSpec.AT_MOST));
            child.measure(MeasureSpec.makeMeasureSpec(600, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(600, MeasureSpec.EXACTLY));
            Log.d("KK", "onMeasure1    i = " + i + "   child.getMeasuredWidth() = " + child.getMeasuredWidth() + "   child.getMeasuredHeight()=" + child.getMeasuredHeight());
            Log.d("KK", "onMeasure2    i = " + i + "   child.getWidth() = " + child.getWidth() + "   child.getHeight()=" + child.getHeight());
        }

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            child.layout(200, 200, (200 + child.getMeasuredWidth() - i * 200), (200 + child.getMeasuredHeight() - i * 200));
            Log.d("KK", "onLayout1   i = " + i + "   child.getMeasuredWidth() = " + child.getMeasuredWidth() + "   child.getMeasuredHeight()=" + child.getMeasuredHeight());
            Log.d("KK", "onLayout2   i = " + i + "   child.getWidth() = " + child.getWidth() + "   child.getHeight()=" + child.getHeight());
        }
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("OOO","MyViewGroup onInterceptTouchEvent ev ="+Util.getActionString(ev));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("OOO","MyViewGroup dispatchTouchEvent ev ="+Util.getActionString(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("OOO","MyViewGroup onTouchEvent ev ="+Util.getActionString(event));
        return super.onTouchEvent(event);
    }
}
