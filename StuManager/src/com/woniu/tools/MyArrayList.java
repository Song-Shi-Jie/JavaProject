/*
 * @Author: 宋世杰
 * @Date: 2023-03-29 11:40:02
 * @LastEditTime: 2023-03-29 12:19:18
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\tools\MyArrayList.java
 * @Description: 请自行修改描述
 */
package com.woniu.tools;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T[] theItems;

    public MyArrayList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    public void doClear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void trimToSize() {
        ensureCapacity(size);
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        }
        theItems = Arrays.copyOf(theItems, newCapacity);
    }

    public T get(int idx) {
        if (idx < 0 || idx > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[idx];
    }

    public T set(int idx, T newvar) {
        if (idx < 0 || idx > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T old = theItems[idx];
        theItems[idx] = newvar;
        return old;
    }

    public boolean add(T x) {
        add(size, x);
        return true;
    }

    public void add(int idx, T x) {
        if (theItems.length == size) {
            ensureCapacity(size + (size >> 1));
        }
        for (int i = size; i > idx; i--) {
            theItems[i] = theItems[i - 1];
        }
        theItems[idx] = x;
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
