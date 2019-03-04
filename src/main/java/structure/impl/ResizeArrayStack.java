package structure.impl;

import structure.Stack;

import java.util.Iterator;

public class ResizeArrayStack<Item> implements Stack<Item> {
    private static final int DEFAULT_CAPACITY=16;
    private Item[] values;
    private int size;

    @SuppressWarnings("unchecked ")
    public ResizeArrayStack() {
        values=(Item[])new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(Item item) {
        if (size == values.length)
            resize(values.length*2);
        values[size++]=item;
    }
    @SuppressWarnings("unchecked ")
    private void resize(int newSize){
        Item[] items=(Item[])new Object[newSize];
        if (size >= 0) System.arraycopy(values, 0, items, 0, size);
        values=items;
    }
    @Override
    public Item pop() {
        Item value = values[--size];
        values[size]=null;
        if (size>0 && size==values.length/4)
            resize(values.length/2);
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

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
