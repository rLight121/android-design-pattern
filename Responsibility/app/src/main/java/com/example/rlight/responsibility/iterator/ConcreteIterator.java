
package com.example.rlight.responsibility.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/15
 */
public class ConcreteIterator<T> implements MyIterator{

    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }


    /**
     * 是否有下一个元素
     * @return true-有
     */
    @Override
    public boolean hasNext(){
        return cursor < list.size();
    }

    /**
     * 返回当前位置元素，并移至下一个
     * @return
     */
    @Override
    public T next(){
        T obj = null;
        if (this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
