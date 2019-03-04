package structure.impl;

import structure.Stack;

import java.util.Iterator;

/**
 *  固定大小的栈需要预估栈的使用大小
 *  大容量的实例会导致大部分空间的浪费
 * @param <Item>
 */
public class FixedCapacityStack<Item> implements Stack<Item> {
    private final int max;
    private Item[] values;
    private int size;

    @SuppressWarnings("unchecked ")
    public FixedCapacityStack(int max) {
        this.max = max;
        values=(Item[]) new Object[max];
    }

    @Override
    public void push(Item item) {
        values[size++]=item;
    }

    @Override
    public Item pop() {
        Item value = values[--size];
        values[size]=null;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isFull(){
        return size==max;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }


}
