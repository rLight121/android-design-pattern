package com.example.rlight.responsibility.viewtouch;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout
{
    private static final String TAG = MyLinearLayout.class.getSimpleName();

        private int viewId;

        public int getViewId() {
            return viewId;
        }

        public void setViewId(int viewId) {
            this.viewId = viewId;
        }

    public MyLinearLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        int action = ev.getAction();
        switch (action)
        {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "viewgroup " + viewId + " dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "viewgroup " + viewId + " dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "viewgroup " + viewId + " dispatchTouchEvent ACTION_UP");
                break;

            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {

        int action = event.getAction();

        switch (action)
        {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "viewgroup " + viewId + " onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "viewgroup " + viewId + " onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "viewgroup " + viewId + " onTouchEvent ACTION_UP");
                break;

            default:
                break;
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {

        int action = ev.getAction();
        switch (action)
        {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "viewgroup " + viewId +" onInterceptTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "viewgroup " + viewId + " onInterceptTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "viewgroup " + viewId + " onInterceptTouchEvent ACTION_UP");
                break;

            default:
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept)
    {
        Log.e(TAG, "viewgroup " + viewId + " requestDisallowInterceptTouchEvent ");
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

}
//import android.content.Context;
//import android.util.AttributeSet;
//import android.util.Log;
//import android.view.MotionEvent;
//import android.widget.LinearLayout;
//
//import static android.content.ContentValues.TAG;
//
///**
// * 描述
// *
// * @author xxx
// * @date 2017/6/9
// */
//public class MyLinearLayout extends LinearLayout{
//    private static final String TAG = MyLinearLayout.class.getSimpleName();
//
//    private int viewId;
//
//    public int getViewId() {
//        return viewId;
//    }
//
//    public void setViewId(int viewId) {
//        this.viewId = viewId;
//    }
//
//
//    public MyLinearLayout(Context context) {
//        super(context);
//    }
//
//    public MyLinearLayout(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        int action = ev.getAction();
//        switch (action)
//        {
//            case MotionEvent.ACTION_DOWN:
//                Log.e(TAG, "viewgroup " + viewId + " dispatchTouchEvent ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.e(TAG, "viewgroup " + viewId + "dispatchTouchEvent ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.e(TAG, "viewgroup " + viewId + "dispatchTouchEvent ACTION_UP");
//                break;
//
//            default:
//                break;
//        }
//        return super.dispatchTouchEvent(ev);
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event)
//    {
//
//        int action = event.getAction();
//
//        switch (action)
//        {
//            case MotionEvent.ACTION_DOWN:
//                Log.e(TAG, "viewgroup " + viewId +"onTouchEvent ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.e(TAG, "viewgroup " + viewId +"onTouchEvent ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.e(TAG,"viewgroup " + viewId + "onTouchEvent ACTION_UP");
//                break;
//
//            default:
//                break;
//        }
//
//        return super.onTouchEvent(event);
//    }
//
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev)
//    {
//
//        int action = ev.getAction();
//        switch (action)
//        {
//            case MotionEvent.ACTION_DOWN:
//                Log.e(TAG,"viewgroup " + viewId + "onInterceptTouchEvent ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.e(TAG, "viewgroup " + viewId +"onInterceptTouchEvent ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.e(TAG, "viewgroup " + viewId +"onInterceptTouchEvent ACTION_UP");
//                break;
//
//            default:
//                break;
//        }
//
//        return super.onInterceptTouchEvent(ev);
//    }
//
//    @Override
//    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept)
//    {
//        Log.e(TAG, "viewgroup " + viewId +"requestDisallowInterceptTouchEvent ");
//        super.requestDisallowInterceptTouchEvent(disallowIntercept);
//    }
//}
