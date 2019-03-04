package algorithms.impl;

import algorithms.Sort;

public class BottomUpMergeSort implements Sort {
    private Comparable[] aux;

    private void merge(Comparable[] arr, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        if (hi + 1 - lo >= 0)
            System.arraycopy(arr, lo, aux, lo, hi + 1 - lo);
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                arr[k] = aux[j++];
            else if (j > hi)
                arr[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                arr[k] = aux[j++];
            else
                arr[k] = aux[i++];
        }
    }

    @Override
    public void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        for (int sz = 1; sz < arr.length; sz = sz + sz) {
            for (int lo = 0; lo < arr.length - sz; lo += sz + sz) {
                merge(arr, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, arr.length - 1));
                printArr(arr);
            }
        }
    }
}
