package structure.impl;

import structure.Node;
import structure.Queue;

import java.util.Iterator;

public class LinkedQueue<Item> implements Queue<Item> {
    private int size;
    private Node<Item> first;
    private Node<Item> last;

    @SuppressWarnings("unchecked ")
    @Override
    public void enqueue(Item item) {
        if (last==null){
            last=(Node<Item>)Node.builder().item(item).build();
            first=last;
        }else{
            last.setNext((Node<Item>)Node.builder().item(item).build());
            last=last.getNext();
        }
        size++;
    }

    @Override
    public Item dequeue() {
        Item item=null;
        if (first!=null){
            item=first.getItem();
            first=first.getNext();
            size--;
        }
        if (first==null)
            last=null;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
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
