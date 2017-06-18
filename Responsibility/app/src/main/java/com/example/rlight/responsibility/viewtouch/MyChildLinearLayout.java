
package com.example.rlight.responsibility.viewtouch;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyChildLinearLayout extends MyLinearLayout
{
    private static final String TAG = MyChildLinearLayout.class.getSimpleName();
    @Override
    public int getViewId() {
            return super.getViewId();
        }
    @Override
    public void setViewId(int viewId) {
            super.setViewId(viewId);
        }

    public MyChildLinearLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {

        Log.e(TAG,"onInterceptTouchEvent");
//        return super.onInterceptTouchEvent(ev);
        return true;
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept)
    {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"onTouchEvent");
//        return super.onTouchEvent(event);
//        return true;
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        Log.e(TAG,"dispatchTouchEvent");
                return super.dispatchTouchEvent(ev);
//        return true;
    }
}

