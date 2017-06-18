
package com.example.rlight.responsibility.uml;

import android.util.Log;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/8
 */
public class ConcreteHandler extends AbstractHandler{

    /**
     * 获取可处理请求等级
     * @return level
     */
    @Override
    protected int getHandleLevel(){
          return level;
      }

    /**
     *  请求处理
     * @param abstractRequest abstractRequest
     */
    @Override
    protected void handle(AbstractRequest abstractRequest){
        Log.e("rlight","ConcreteHandler Level : " + getHandleLevel()
            + "  request level: "+ abstractRequest.getRequestLevel()
            + " request content: " + abstractRequest.getContent());
    }

    private int level;

    /**
     * 设置可处理请求的等级
     * @param level level
     */
    @Override
    public void setHandleLevel(int level){
        this.level = level;
    }

}
