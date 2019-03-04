package algorithms.impl;

import algorithms.Sort;

public abstract class QuickSort implements Sort {
    @Override
    public void sort(Comparable[] arr) {
        //shuffle(arr);
        sort(arr,0,arr.length-1);
    }
    private void sort(Comparable[] arr,int l,int h){
        if (h<=l)
            return;
        int partition = partition(arr, l, h);//切分
        //切分点不参与排序
        sort(arr,l,partition-1);//排序切分点左边
        sort(arr,partition+1,h);//排序切分点右边
    }


    /**
     *
     * @param arr
     * @param l
     * @param h
     * @return
     */
    protected abstract int partition(Comparable[] arr,int l,int h);
//    {
//        Comparable point=arr[l];//选中最左端作为切分点
//        int i=l,j=h+1;
//        while (true){
//            while (less(point,arr[--j]) && j!=l)
//                ;//找到右边不大于基准点的位置
//            while (less(arr[++i],point) && i!=h)
//                ;//找到左边不小于基准点的位置
//
//
//           // printArr(arr);
////            System.out.println("l:"+l+" h:"+h);
////            System.out.println("i:"+i+" j:"+j);
//            if (i>=j)//切分点在边界时会出现==的情况
//                break;
//            exch(arr,i,j);//交换两个位置的数
//        }//相遇的位置左边是小于基准点的数,右边是大于基准点的位置
//        /**
//         * i>j 导致的相遇时,i-1=j,此时a[i,h]>p,a[l,j]<p,
//         * 若i和p交换,则a[i]>p不符合预期
//         * 而j和p交换,则a[j]<p仍然符合预期
//         */
//        exch(arr,l,j);//将基准点交换到相遇的位置
//        return j;
//    }
}
