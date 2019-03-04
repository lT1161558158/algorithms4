package algorithms.impl;

import algorithms.Sort;

public class SelectSort implements Sort {

    /**
     *  倒序排列
     * @param arr arr
     */
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max=i;
            for (int j = i; j < arr.length; j++) {
                if (less(arr[max],arr[j]))
                    max=j;
            }
            exch(arr,max,i);
        }
    }
}
