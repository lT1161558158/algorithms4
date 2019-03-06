package structure.st.impl;

import structure.st.SortST;

import java.util.Iterator;

public class BinarySearchST<K extends Comparable<K>, V> implements SortST<K, V> {

    private int size;
    private K[] keys;
    private V[] values;

    @SuppressWarnings("unchecked ")
    public BinarySearchST(int capacity) {
        keys = (K[]) new Comparable[capacity];
        values = (V[]) new Comparable[capacity];
    }

    @Override
    public int rank(K k) {
        return rank(k, 0, size - 1);
    }

    @Override
    public K select(int k) {
        return k > 0 && k < size ? keys[k] : null;
    }

    @Override
    public Iterable<K> keys(K lo, K hi) {
        return null;
    }

    @Override
    public void put(K k, V v) {
        int i = rank(k);
        if (i < size && keys[i].compareTo(k) == 0) {
            values[i] = v;
            return;
        }
        for (int j = size; j > i; j--) {
            keys[j] = keys[j - 1];
            values[j] = values[j - 1];
        }
        keys[i] = k;
        values[i] = v;
        size++;
    }

    @Override
    public V get(K k) {
        if (isEmpty())
            return null;
        int i = rank(k);
        if (i < size && keys[i].compareTo(k) == 0)
            return values[i];
        else
            return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<K> keys() {
        return null;
    }

    @Override
    public void delete(K k) {
        int i = rank(k);
        if (i < size && k.compareTo(keys[i]) == 0) {
            for (int j = i; j < size; j++) {
                keys[j] = keys[j + 1];
                values[j] = values[j + 1];
            }
        }
    }

    private int rank(K k, int lo, int hi) {
        if (lo > hi)
            return lo;
        int mid = (lo + hi) / 2;
        int cmp = keys[mid].compareTo(k);
        if (cmp < 0)
            return rank(k, lo, mid - 1);
        else if (cmp > 0)
            return rank(k, mid, hi);
        else
            return mid;
    }
}
