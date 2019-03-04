package structure.impl;

import structure.Node;
import structure.Queue;
import structure.Stack;

import java.util.Iterator;

public class LinkedSteque<Item> implements Stack<Item>, Queue<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int size;

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
    public void push(Item item) {
        enqueue(item);
    }

    @Override
    public Item pop() {

        return null;
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
