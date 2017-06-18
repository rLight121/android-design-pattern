
package com.example.rlight.responsibility.uml;

import android.util.Log;

import com.example.rlight.responsibility.uml.AbstractRequest;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/8
 */
public abstract class AbstractHandler{

    public AbstractHandler nextHandler;

    public void handleRequest(AbstractRequest abstractRequest){
            if (abstractRequest.getRequestLevel() == getHandleLevel()){
                handle(abstractRequest);
            } else {
                if (nextHandler != null){
                    nextHandler.handleRequest(abstractRequest);
                }else {
                    Log.d("rlight","no handler");
                }

            }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest abstractRequest);

    public abstract void setHandleLevel(int handleLevel);

}
