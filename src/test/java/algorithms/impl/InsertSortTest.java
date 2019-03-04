package algorithms.impl;

import algorithms.Sort;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {

    @Test
    public void sort() {
        int count=10;
        Integer[] arr=new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i]=i;
        }
        Sort sort=new InsertSort();
        sort.sort(arr);
        sort.printArr(arr);
    }
}