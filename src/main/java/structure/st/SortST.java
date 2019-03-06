package structure.st;

public interface SortST<K extends Comparable<K>, V> extends ST<K, V> {
    default K min(){
        return select(0);
    }

    default K max(){
        return select(size()-1);
    }

    /**
     * @param k k
     * @return 小于等于k的最大键
     */
    default K floor(K k) {
        int i = rank(k);
        K select = select(i);
        return select.compareTo(k) == 0 ? select : select(i - 1);
    }

    /**
     * @param k k
     * @return 大于等于k的最小键
     */
    default K ceiling(K k) {
        int i = rank(k);
        K select = select(i);
        return select.compareTo(k) == 0 ? select : select(i + 1);
    }

    /**
     * @param k k
     * @return 小于k的键的数量
     */
    int rank(K k);

    /**
     * @param k k
     * @return 排名为k的键
     */
    K select(int k);

    default void deleteMin(){
        delete(min());
    }

    default void deleteMax(){
        delete(max());
    }

    /**
     * @param lo
     * @param hi
     * @return [lo, ..., hi]的数量
     */
    default int size(K lo, K hi) {
        int i = rank(lo);
        int j = rank(hi);
        return j - i + 1;
    }

    ;

    /**
     * @param lo
     * @param hi
     * @return [lo, ..., hi]的所有键，已排序
     */
    Iterable<K> keys(K lo, K hi);

    /**
     * keys()返回一个已经排序了的集合
     */

}
