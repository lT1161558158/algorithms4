package structure;

public class HeapMaxPriorityQueue<K extends Comparable<K>> implements MaxPriorityQueue<K> {
    private int max;
    private int index=1;
    private K[] pq;

    public HeapMaxPriorityQueue(int max) {
        this.max = max;
        pq=(K[])new Object[max+1];
    }

    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }

    private void exch(int i,int j){
        K k=pq[i];
        pq[i]=pq[j];
        pq[j]=k;
    }

    private void swim(int k){
        while (k>1 && less(k/2,k)){
            exch(k/2,k);
            k=k/2;
        }
    }
    private void sink(int k){
        while (2*k <=index){
            int j=2*k;
            if (j<index && less(j,j+1))
                j++;
            if (!less(k,j))
                break;
            exch(k,j);
            k=j;
        }
    }

    public void insert(K k) {
        pq[index++]=k;
        swim(index);
    }

    public K max() {
        return pq[1];
    }

    public K delMax() {
        K max=max();
        exch(1,index--);
        pq[index+1]=null;
        sink(1);
        return max;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return index-1;
    }
}
