package structure.st.impl;

import structure.Node;
import structure.st.SortST;
import structure.st.TreeNode;

import java.util.Iterator;

public class BinarySearchTreeSortST<K extends Comparable<K>, V> implements SortST<K, V> {
    TreeNode<K, V> root;

    @Override
    public int rank(K k) {
        return 0;
    }

    @Override
    public K select(int k) {
        return null;
    }

    @Override
    public Iterable<K> keys(K lo, K hi) {
        return null;
    }

    @Override
    public void put(K k, V v) {
        root = put(root, k, v);
    }

    @Override
    public V get(K k) {
        TreeNode<K, V> kvTreeNode = get(root, k);
        return kvTreeNode == null ? null : kvTreeNode.getV();
    }

    @Override
    public int size() {
        return size(root);
    }

    @Override
    public Iterator<K> keys() {
        return null;
    }

    private int size(TreeNode<K, V> node) {
        return node == null ? 0 : node.getN();
    }

    private TreeNode<K, V> get(TreeNode<K, V> node, K k) {
        if (node == null)
            return null;
        int i = k.compareTo(node.getK());
        if (i < 0)
            return get(node.getLeft(), k);
        else if (i > 0)
            return get(node.getRight(), k);
        else
            return node;
    }

    private TreeNode<K, V> put(TreeNode<K, V> node, K k, V v) {
        if (node == null)
            return new TreeNode<>(k, v);
        int i = k.compareTo(node.getK());
        if (i < 0)
            node.setLeft(put(node.getLeft(), k, v));
        else if (i > 0)
            node.setRight(put(node.getRight(), k, v));
        else node.setV(v);
        node.setN(size(node.getLeft()) + size(node.getRight()) + 1);
        return node;
    }

    @Override
    public K min() {

        return min(root);
    }

    private K min(TreeNode<K, V> node) {
        if (node == null)
            return null;
        if (node.getLeft() != null)
            return min(node.getLeft());
        else
            return node.getK();
    }

    @Override
    public K max() {
        return max(root);
    }

    private K max(TreeNode<K, V> node) {
        if (node == null)
            return null;
        if (node.getRight() != null)
            return max(node.getRight());
        else
            return node.getK();
    }

    @Override
    public K floor(K k) {
        TreeNode<K, V> floor = floor(root, k);
        return floor == null ? null : floor.getK();
    }

    private TreeNode<K, V> floor(TreeNode<K, V> node, K k) {
//        if (node==null)
//            return null;
//        int i = k.compareTo(node.getK());
//        if (i<0)
//            return floor(node.getLeft(),k);
//        else{
//            TreeNode<K, V> right = node.getRight();
//            if (right!=null && k.compareTo(right.getK())>=0)
//                return floor(right,k);
//            else
//                return node.getK();
//        }
        if (node == null) return null;//节点为null,则返回null
        int cmp = k.compareTo(node.getK());//比较k和node.k的大小
        if (cmp == 0) return node;//k==node.k时直接返回node
        if (cmp < 0) return floor(node.getLeft(), k);//k<node.k时,说明小于k的值仅可能存在在左子树中
        TreeNode<K, V> t = floor(node.getRight(), k);//k>node.k时,测试右子树,会一直递归右子树
        return t != null ? t : node;
    }

    @Override
    public K ceiling(K k) {
        return null;
    }
    private TreeNode<K, V> ceiling(TreeNode<K, V> node, K k){
        if (node==null)return null;
        int cmp = k.compareTo(node.getK());
        if (cmp==0)return node;
        if (cmp>0) return floor(node.getRight(),k);
        TreeNode<K, V> t = floor(node.getLeft(), k);
        return t != null ? t : node;
    }
}
