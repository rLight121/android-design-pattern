
package com.example.rlight.responsibility.iterator;

/**
 * 描述
 *
 * @author xxx
 * @date 2017/6/15
 */
public interface MyIterator <T> {
    /**
     * 是否有下一个元素
     * @return true-有
     */
    boolean hasNext();

    /**
     * 返回当前位置元素，并移至下一个
     * @return
     */
    T next();
}
