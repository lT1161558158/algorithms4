package structure;

public interface SortST<K extends Comparable<K>,V> extends ST<K,V>{
    K min();
    K max();

    /**
     *
     * @param k k
     * @return 小于等于k的最大键
     */
    K floor(K k);

    /**
     *
     * @param k k
     * @return 大于等于k的最小键
     */
    K ceiling(K k);

    /**
     *
     * @param k k
     * @return 小于k的键的数量
     */
    int rank(K k);

    /**
     *
     * @param k k
     * @return 排名为k的键
     */
    K select(int k);

    void deleteMin();

    void deleteMax();

    /**
     *
     * @param lo
     * @param hi
     * @return [lo,...,hi]的数量
     */
    int size(K lo,K hi);

    /**
     *
     * @param lo
     * @param hi
     * @return [lo,...,hi]的所有键，已排序
     */
   Iterable<K> keys(K lo,K hi);

    /**
     * keys()返回一个已经排序了的集合
     */

}
