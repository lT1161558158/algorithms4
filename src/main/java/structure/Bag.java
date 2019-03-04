package structure;

/**
 * 背包
 * 使用背包说明元素的处理顺序不重要
 * @param <Item>
 */
public interface Bag<Item> extends Iterable<Item> {
    void add(Item item);
    boolean isEmpty();
    int size();
}
