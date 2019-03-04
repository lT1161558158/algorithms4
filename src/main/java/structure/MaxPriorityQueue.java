package structure;

import lombok.Data;

public interface MaxPriorityQueue<K extends Comparable<K>> {

    void insert(K k);
    K max();
    K delMax();
    boolean isEmpty();
    int size();
}
