package structure.st.impl;

import structure.st.ST;
import structure.STNode;

import java.util.Iterator;

public class SequentialSearchST<K,V> implements ST<K,V> {
    private STNode<K,V> first;
    private int size;
    @Override
    public void put(K k, V v) {
        for (STNode<K,V> node=first;node!=null;node=node.getNext()){
            if (k.equals(node.getKey()))
                node.setValue(v);
        }
        first=new STNode<>(k, v,first);
        size++;
    }

    @Override
    public V get(K k) {
        for (STNode<K,V> node=first;node!=null;node=node.getNext()){
            if (k.equals(node.getKey()))
                return node.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * 立即删除
     * @param k k
     */
    @Override
    public void delete(K k) {
        if (k.equals(first.getKey())){
            first=first.getNext();
            size--;
        }else{
            for (STNode<K,V> node=first;node!=null;node=node.getNext()){
                if (node.getNext()!=null && k.equals(node.getNext().getKey())) {
                    node.setNext(node.getNext().getNext());
                    size--;
                    break;
                }
            }
        }
    }

    //-------------------------
    @Override
    public Iterator<K> keys() {
        return new SequentialSearchSTIterable(first);
    }

    private class SequentialSearchSTIterable implements Iterator<K>{
        private STNode<K,V> temp;

        SequentialSearchSTIterable(STNode<K, V> temp) {
            this.temp = temp;
        }

        @Override
        public boolean hasNext() {
            return temp!=null;
        }

        @Override
        public K next() {
            K key = temp.getKey();
            temp=temp.getNext();
            return key;
        }
    }
}
