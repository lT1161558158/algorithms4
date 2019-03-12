package structure.st;

import lombok.Data;

@Data
public class TreeNode<K,V> {
    K k;
    V v;
    TreeNode<K,V> left;
    TreeNode<K,V> right;
    int n;
    public TreeNode(K k, V v) {
        this.k = k;
        this.v = v;
    }
}
