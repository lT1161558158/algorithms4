package algorithms.impl;

import algorithms.Sort;

public class MergeSort implements Sort {
    private Comparable[] aux;



    @Override
    public void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    /**
     * 实际上是递归的找到最小子数组,然后进行归并
     * @param a
     * @param lo
     * @param hi
     */
    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        boundaryMerge(a,aux, lo, mid, hi);
        printArr(a);
    }
}
