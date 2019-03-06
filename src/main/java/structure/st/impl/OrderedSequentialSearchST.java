package structure.st.impl;

import structure.STNode;
import structure.st.SortST;

import java.util.Iterator;

public class OrderedSequentialSearchST<K extends Comparable<K>,V>  implements SortST<K,V> {
    private STNode<K,V> first;
    private STNode<K,V> last;

    @Override
    public K min() {
        return null;
    }

    @Override
    public K max() {
        return null;
    }

    @Override
    public K floor(K k) {
        return null;
    }

    @Override
    public K ceiling(K k) {
        return null;
    }

    @Override
    public int rank(K k) {
        int i=0;
        STNode<K,V> temp=first;
        while (first!=last && temp!=null){
            if (temp.getKey().compareTo(k)>0){
                i++;
            }else {
                break;
            }
        }
        return i;
    }

    @Override
    public K select(int k) {
        return null;
    }

    @Override
    public void deleteMin() {

    }

    @Override
    public void deleteMax() {

    }

    @Override
    public int size(K lo, K hi) {
        return 0;
    }

    @Override
    public Iterable<K> keys(K lo, K hi) {
        return null;
    }

    @Override
    public void put(K k, V v) {

    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<K> keys() {
        return null;
    }
}
