package algorithms.impl;

import algorithms.Sort;

public class InsertSort implements Sort {
    @Override
    public void sort(Comparable[] arr) {
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j=i;j>0 && !less(arr[j],arr[j-1]);j--){
                exch(arr,j,j-1);
                printArr(arr);
            }
        }

    }
}
