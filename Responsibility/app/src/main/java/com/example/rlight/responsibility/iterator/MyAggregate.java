
package com.example.rlight.responsibility.iterator;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/15
 */
public interface MyAggregate <T> {
    /**
     *  add
     * @param obj  obj
     */
    void add(T obj);

    /**
     *  remove
     * @param obj  obj
     */
    void remove(T obj);

    /**
     *  获取容器迭代器
     * @return MyIterator
     */
    MyIterator<T> interator();
}
