
package com.example.rlight.responsibility.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/15
 */
public class ConcreteAggregate <T> implements MyAggregate<T>{

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public MyIterator interator() {
        return new ConcreteIterator<>(list);
    }
}
