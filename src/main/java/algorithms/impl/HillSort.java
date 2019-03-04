package algorithms.impl;

import algorithms.Sort;

public class HillSort implements Sort {
    @Override
    public void sort(Comparable[] arr) {
        printArr(arr);
        int h = 1;
        while (h < arr.length / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            System.out.println("h:"+h);
            for (int i = h; i < arr.length; i++) {
                //System.out.println("i:"+i);
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exch(arr, j, j - h);
                    printArr(arr);
                }
            }
            h /= 3;
        }
    }
}
