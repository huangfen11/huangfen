package com.example.hf.dispatchtest;

import android.view.MotionEvent;

/**
 * Created by hf on 18-7-4.
 */

public class Util {

    public static String getActionString(MotionEvent ev){
        String action = null;
        if(ev.getAction()==0){
            action = "ACTION_DOWN";
        }else if(ev.getAction()==1){
            action = "ACTION_UP";
        }else if(ev.getAction()==2){
            action = "ACTION_MOVE";
        }
        return action;
    }
}
