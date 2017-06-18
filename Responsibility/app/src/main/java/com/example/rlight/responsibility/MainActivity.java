package com.example.rlight.responsibility;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


import com.example.rlight.responsibility.iterator.ConcreteAggregate;
import com.example.rlight.responsibility.iterator.MyAggregate;
import com.example.rlight.responsibility.iterator.MyIterator;
import com.example.rlight.responsibility.uml.AbstractHandler;
import com.example.rlight.responsibility.uml.AbstractRequest;
import com.example.rlight.responsibility.uml.ConcreteHandler;
import com.example.rlight.responsibility.uml.ConcreteRequest;
import com.example.rlight.responsibility.viewtouch.MyButton;
import com.example.rlight.responsibility.viewtouch.MyChildButton;
import com.example.rlight.responsibility.viewtouch.MyChildLinearLayout;
import com.example.rlight.responsibility.viewtouch.MyLinearLayout;

public class MainActivity extends Activity {

    protected static final String TAG = "MyButton";
    protected static final String TAG2 = "MyButton2";
    protected static final String TAG3 = "MyButton3";
    private MyButton mButton ;
    private MyButton mButton2 ;
    private MyChildButton mButton3;
    private MyLinearLayout myLly1;
    private MyLinearLayout myLly2;
    private MyChildLinearLayout myLly3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showUMLCode();
//
//        showIteratorUMLCode(); // 迭代器模式
//
        initView();
//


}

    private void initView(){
        myLly1 = (MyLinearLayout) findViewById(R.id.lly_my1);
        myLly2 = (MyLinearLayout) findViewById(R.id.lly_my2);
        myLly3 = (MyChildLinearLayout) findViewById(R.id.lly_my3);
        myLly1.setViewId(1);
        myLly2.setViewId(2);
        myLly3.setViewId(3);

        mButton = (MyButton) findViewById(R.id.button_my);
        mButton.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();

                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                return false;
            }
        });

        mButton2 = (MyButton) findViewById(R.id.button_my2);
        mButton2.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();

                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG2, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG2, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG2, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                return false;
            }
        });

        mButton3 = (MyChildButton) findViewById(R.id.button_my3);
        mButton3.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();

                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG3, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG3, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG3, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                return true;
            }
        });
    }

    private void showUMLCode(){

        AbstractHandler abstractHandler1 = new ConcreteHandler();
        AbstractHandler abstractHandler2 = new ConcreteHandler();
        AbstractHandler abstractHandler3 = new ConcreteHandler();

        abstractHandler1.setHandleLevel(1);
        abstractHandler2.setHandleLevel(2);
        abstractHandler3.setHandleLevel(3);

        // 构造责任链
        abstractHandler1.nextHandler = abstractHandler2;
        abstractHandler2.nextHandler = abstractHandler3;
        abstractHandler3.nextHandler = abstractHandler1;

        AbstractRequest abstractRequest1 = new ConcreteRequest("Request 1");
        AbstractRequest abstractRequest2 = new ConcreteRequest("Request 2");
        AbstractRequest abstractRequest3 = new ConcreteRequest("Request 3");

        abstractRequest1.setRequestLevel(1);
        abstractRequest2.setRequestLevel(2);
        abstractRequest3.setRequestLevel(3);

        // 都从第一个handler开始
        abstractHandler1.handleRequest(abstractRequest1);
        abstractHandler1.handleRequest(abstractRequest2);
        abstractHandler1.handleRequest(abstractRequest3);


    }

    private void showIteratorUMLCode(){
        MyAggregate<String> names = new ConcreteAggregate<>();
        names.add("XDD");
        names.add("PMM");
        names.add("HAMA");
        MyIterator<String> myIterator = names.interator();
        while (myIterator.hasNext()){
            Log.e("ChaShuiBiao",myIterator.next());
        }

    }

}
