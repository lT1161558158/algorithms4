package algorithms.impl;

import algorithms.Sort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class SelectSortTest {

    @Test
    public void sort() {
        int count=100;
        Integer[] arr=new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i]=i;
        }
        Sort sort=new SelectSort();
        sort.sort(arr);
        sort.printArr(arr);
    }
}