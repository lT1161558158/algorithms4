package structure;

import structure.Queue;

public interface CycleBuffer<Item> extends Queue<Item> {

    boolean isFull();

    Item[] read(int length);
    void write(Item[] wait);
    int freeSize();
}
