package structure;

import lombok.Data;

@Data
public class STNode<K,V> {
    private K key;
    private V value;
    private STNode<K,V> next;

    public STNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public STNode(K key, V value, STNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
