package structure.st.impl;

import structure.st.ST;

import java.util.Iterator;

public class ArrayST<K, V> implements ST<K, V> {
    private int size;
    private K[] keys;
    private V[] values;

    @SuppressWarnings("unchecked ")
    public ArrayST(int capacity) {
        keys = (K[]) new Object[capacity];
        values = (V[]) new Object[capacity];
    }

    @Override
    public void put(K k, V v) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(k)) {
                keys[i] = k;
                values[i] = v;
            }
        }
        keys[size] = k;
        values[size] = v;
        size++;
    }

    @Override
    public V get(K k) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(k)) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(K k) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(k)) {
                size--;
                for (int j = i; j < size - 1; j++) {
                    keys[i] = keys[i + 1];
                    values[i] = values[i + 1];
                }
            }
        }
    }

    @Override
    public Iterator<K> keys() {
        return null;
    }

}
