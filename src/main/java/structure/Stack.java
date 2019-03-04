package structure;

/**
 * 下压栈/栈
 * LIFO
 * 后进先出的集合类型
 *
 * @param <Item>
 */
public interface Stack<Item> extends Iterable<Item> {
    void push(Item item);
    Item pop();
    boolean isEmpty();
    int size();
}
