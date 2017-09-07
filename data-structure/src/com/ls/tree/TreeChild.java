package com.ls.tree;

/**
 * 孩子表示法
 * n个结点有n个孩子链表.(当该节点为叶子节点的时候,该节点的孩子链表为null)
 * n个结点的投指针组成一个线性表(数组? 数组不能改变大小,线性表可以)
 * <p>
 * 线性表可以是静态的就可以理解成数组,而线性表又可以是动态的那就是链表
 *
 * @author liushuang 2017/9/8
 */
public class TreeChild<E> {

    //链表结构
    private static class ChildNode {
        private Integer childIndex;//当前结点的下标
        private Integer next; //下一个结点的下标

        public ChildNode(Integer childIndex, Integer next) {
            this.childIndex = childIndex;
            this.next = next;
        }
    }

    private static class Node<T> {
        private T data; //数据域,记录该节点的数据信息.
        private Integer firstNode; //该结点的第一个子结点

        public Node(T data, Integer firstNode) {
            this.data = data;
            this.firstNode = firstNode;
        }
    }

    private final int DEFAULT_TREE_SIZE = 100;
    private int treeSize = 0;

    // 使用一个Node[]数组来记录该树的所有节点,数组表示线性表.
    private Node<E>[] nodes;

    // 记录节点数
    private int nodeNums;

    // 以指定根节点创建树
    public TreeChild(E data) {

    }

    //为指定结点添加子结点
    public void addNode(E data, Node<E> node) {
        for (int i = 0; i < treeSize; i++) {
            //找到线性表的尾部,将节点加上去.
            if(nodes[i] == null) {
                //创建一个新的节点,加到线性表上.
                // 如果指定结点没有子结点,那么first结点=data
                //然后遍历指定结点的链表,将添加的节点放到链表尾部.

                return;//加完就结束
            }
        }
    }
}
