package structure.impl;

import structure.Stack;

import java.util.Iterator;

public class FixedCapacityStackOfStrings implements Stack<String> {
    private final int max;
    private String[] values;
    private int size;
    public FixedCapacityStackOfStrings(int max) {
        this.max = max;
        values=new String[max];
    }

    public void push(String s) {
        values[size++]=s;
    }

    public String pop() {
        return values[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean isFull(){
        return size==max;
    }

    //--------------------------迭代器实现-------------------------------
    public Iterator<String> iterator() {
        return null;
    }
}
