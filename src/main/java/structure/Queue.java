package structure;

/**
 * FIFO队列
 * 基于先进先出策略的集合类型
 * 保存数据的同时保存相对位置
 *
 * @param <Item>
 */
public interface Queue<Item> extends Iterable<Item> {
    void enqueue(Item item);
    Item dequeue();
    boolean isEmpty();
    int size();
}
