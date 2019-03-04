package algorithms.impl;

import algorithms.Sort;
import org.junit.Test;

import static org.junit.Assert.*;

public class BottomUpMergeSortTest {

    @Test
    public void sort() {
        int count=10;
        Integer[] arr=new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[count-i-1]=i;
        }
        Sort sort=new BottomUpMergeSort();
        sort.sort(arr);
        sort.printArr(arr);
    }
}