package structure;

/**
 * 每个键只对应着一个值（表中不允许存在重复的值）
 * 插入一个已经存在的键，会导致新值覆盖旧值
 * 键不能为null
 * 值不能为null
 * 删除：
 * 1. 延时删除(默认)
 * 2. 即时删除
 * @param <K>
 * @param <V>
 */
public interface ST<K,V> {

    void put(K k,V v);

    V get(K k);

    default void delete(K k){
        put(k,null);
    }

    default boolean contains(K k){
        return get(k)!=null;
    }

    default boolean isEmpty(){
        return size()==0;
    }

    int size();

    Iterable<K> keys();
}
