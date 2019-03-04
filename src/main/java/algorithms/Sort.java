package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Sort {
    void sort(Comparable[] arr);
    default void exch(Object[] arr,int i,int j){
        Object a=arr[i];
        arr[i]=arr[j];
        arr[j]=a;
    }
    @SuppressWarnings("unchecked ")
    default boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    /**
     * 需要进行边界检查的的归并
     * 稳定的
     * @param arr 原始数组
     * @param aux 临时数组
     * @param lo 左边界
     * @param mid 中界
     * @param hi 右边界
     */
    default void boundaryMerge(Comparable[] arr,Comparable[] aux, int lo, int mid, int hi){
        int i = lo, j = mid + 1;
        if (hi + 1 - lo >= 0)
            System.arraycopy(arr, lo, aux, lo, hi + 1 - lo);
        for (int k = lo; k <= hi; k++) {
            if (i > mid)//左边结束
                arr[k] = aux[j++];//复制剩下的所有右边到原数组
            else if (j > hi)//右边结束
                arr[k] = aux[i++];//复制剩下的所有左边到原数组
            else if (less(aux[j], aux[i]))//左边较小
                arr[k] = aux[j++];//复制右边
                //先进行这部分将会是稳定的
            else
                arr[k] = aux[i++];//复制左边
        }
    }

    /**
     * 无需边界检查的归并
     * 不稳定
     * @param arr 原始数组
     * @param aux 临时数组
     * @param lo 左边界
     * @param mid 中界
     * @param hi 右边界
     */
    default void unBoundaryMerge(Comparable[] arr,Comparable[] aux, int lo, int mid, int hi){
        //左部分复制进临时数组
        if (mid + 1 - lo >= 0)
            System.arraycopy(arr, lo, aux, lo, mid + 1 - lo);

        for (int j = mid + 1; j <= hi; j++)//因为j是从右向左移动,左数组是部分有序的
            aux[j] = arr[hi - j + mid + 1];//右部分倒序复制到数组

        int i = lo, j = hi;//左右边界
        for (int k = lo; k <= hi; k++)
            if (less(aux[j], aux[i]))
                arr[k] = aux[j--];//j从右边界开始向左移动
            else
                arr[k] = aux[i++];//i从左边界开始向右移动
        //无论全部是i++或者j--,都不会越界
    }

    /**
     * 随机打乱数组
     * @param arr 原始数组
     */
    default void shuffle(Comparable[] arr){
        List<Comparable> list= Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
    }

    default void printArr(Comparable[] arr){
        for (Comparable comparable : arr) {
            System.out.print(comparable.toString());
            System.out.print(",");
        }
        System.out.println();
    }
}
