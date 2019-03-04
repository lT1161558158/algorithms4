package algorithms.impl;

import algorithms.Sort;

public class QuickMergeSort implements Sort {
    private Comparable[] aux;


    @Override
    public void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr,0,arr.length-1);
    }
    private void sort(Comparable[] arr,int lo,int hi){
        if (hi<=lo)
            return;
        int mid=(hi-lo)/2+lo;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        unBoundaryMerge(arr,aux,lo,mid,hi);
    }
}
