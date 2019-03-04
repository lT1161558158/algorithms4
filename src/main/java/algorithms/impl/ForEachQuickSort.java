package algorithms.impl;

public class ForEachQuickSort extends QuickSort {
    @Override
    protected int partition(Comparable[] arr, int l, int h) {
        int p=l;
        for (int i = l+1; i <=h ; i++) {
            if (less(arr[i],arr[l]))//将<arr[p]的数往左边靠,每次交换都对p++,记录左边已经放的位置
                exch(arr,++p,i);
        }
        exch(arr,l,p);//将l交换到p的位置
        return p;
    }
}
