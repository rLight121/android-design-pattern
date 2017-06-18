
package com.example.rlight.responsibility.uml;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/8
 */
public class ConcreteRequest extends AbstractRequest {

    public ConcreteRequest(Object obj){
        super(obj);
    }

    /**
     * 获取请求等级
     * @return requestLevel
     */
    @Override
    public int getRequestLevel(){
        return requestLevel;
    }

    private int requestLevel;

    /**
     * 设置当前请求等级
     * @param requestLevel
     */
    public void setRequestLevel(int requestLevel){
        this.requestLevel = requestLevel;
    }
}
