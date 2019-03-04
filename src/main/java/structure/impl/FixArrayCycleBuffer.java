package structure.impl;

import structure.CycleBuffer;

import java.util.Iterator;

public class FixArrayCycleBuffer<Item> implements CycleBuffer<Item> {
    private int max;
    private int size;
    private Item[] value;

    @SuppressWarnings("unchecked ")
    public FixArrayCycleBuffer(int max) {
        this.max = max;
        value = (Item[]) new Object[max];
    }

    @Override
    public boolean isFull() {
        return size == max;
    }

    @SuppressWarnings("unchecked ")
    @Override
    public Item[] read(int length) {
        Item[] result=(Item[])new Object[length];
        for (int i = 0; i < length; i++) {
            result[i]=dequeue();
        }
        return result;
    }

    @Override
    public void write(Item[] wait) {
        for (Item item : wait) {
            enqueue(item);
        }
    }

    @Override
    public int freeSize() {
        return max - size;
    }

    @Override
    public void enqueue(Item item) {
        value[size++] = item;
    }

    @Override
    public Item dequeue() {
        Item item = value[--size];
        value[size] = null;
        return item;
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
