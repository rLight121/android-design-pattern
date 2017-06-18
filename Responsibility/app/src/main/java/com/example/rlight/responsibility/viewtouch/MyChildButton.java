
package com.example.rlight.responsibility.viewtouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/9
 */

public class MyChildButton extends MyButton
{
    private static final String TAG = MyChildButton.class.getSimpleName();

    public MyChildButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.e(TAG, "onTouchEvent");
//        return super.onTouchEvent(event);
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        return super.dispatchTouchEvent(event);
    }


}
