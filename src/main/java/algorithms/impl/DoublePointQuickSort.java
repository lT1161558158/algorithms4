package algorithms.impl;

public class DoublePointQuickSort extends QuickSort {
    @Override
    protected int partition(Comparable[] arr, int l, int h) {
        int p=l,q=h+1;
        while (true){
            while (less(arr[++p],arr[l]) && p!=h);
            while (less(arr[l],arr[--q]) && q!=l);
            if (p>=q)
                break;
            exch(arr,p,q);
        }
        exch(arr,l,q);
        return q;
    }
}
