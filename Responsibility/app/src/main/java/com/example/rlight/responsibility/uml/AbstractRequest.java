
package com.example.rlight.responsibility.uml;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/8
 */
public abstract class AbstractRequest{

    private Object object;

    public AbstractRequest(Object obj){
        this.object = obj;
    }

    /**
     * 获取请求内容
     * @return object
     */
    public Object getContent() {
        return object;
    }


    /**
     * 获取请求等级
     * @return requestLevel
     */
     public abstract int getRequestLevel();

    /**
     * 设置当前请求等级
     * @param requestLevel
     */
     public abstract void setRequestLevel(int requestLevel);


}
