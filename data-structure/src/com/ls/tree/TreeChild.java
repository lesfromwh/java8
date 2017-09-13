package com.ls.tree;

import com.sun.javafx.logging.PulseLogger;

import java.util.ArrayList;
import java.util.List;

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
        private ChildNode next; //下一个结点

        public ChildNode(Integer childIndex, ChildNode next) {
            this.childIndex = childIndex;
            this.next = next;
        }
    }

    public static class Node<T> {
         T data; //数据域,记录该节点的数据信息.
         ChildNode firstNode; //该结点的第一个子结点

        public Node(T data) {
            this.data = data;
            this.firstNode = null;
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
        treeSize = DEFAULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    // 以指定根节点、指定treeSize创建树
    public TreeChild(E data, int treeSize) {
        this.treeSize = treeSize;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    //为指定结点添加子结点
    public void addNode(E data, Node<E> node) {
        for (int i = 0; i < treeSize; i++) {
            //找到线性表的尾部,将节点加上去.
            if (nodes[i] == null) {
                //创建一个新的节点,加到线性表上.
                nodes[i] = new Node<E>(data);
                // 如果指定结点没有子结点,那么first结点=data
                if (node.firstNode == null) {
                    node.firstNode = new ChildNode(i, null);
                }
                //然后遍历指定结点的链表,将新节点放到链表尾部.
                ChildNode next = node.firstNode;
                while (next.next != null) {
                    next = next.next;
                }
                next.next = new ChildNode(i, null);
                nodeNums++;
                return;//加完就结束
            }
        }
    }

    // 判断是否为空
    public boolean isEmpty() {
        //判断根节点是否为空
        return nodes[0] == null;
    }

    // 获取根节点
    public Node<E> getRoot() {
        return nodes[0];
    }

    // 获取指定节点的所有子节点
    public List<Node<E>> getChildren(Node<E> node) {
        //遍历链表.  链表中只有下标.  data在数组中. 
        ArrayList<Node<E>> list = new ArrayList<>();
        ChildNode next = node.firstNode;
        for (int i = 0; next != null; i++) {
            list.add(nodes[next.childIndex]);
        }
        return list;
    }

    // 返回指定节点的第index个子节点
    public Node<E> getChildByIndex(Node<E> node, int index) {
        ChildNode next = node.firstNode;
        for (int i = 0; next != null; i++) {
            if (i == index) {
                return nodes[next.childIndex];
            }
            next = next.next;
        }
        return null;
    }

    // 返回包含指定节点的索引
    public Integer childIndex(Node<E> node) {
        for (int i = 0; i < treeSize; i++) {
            if (nodes[i] == node) {
                return i;
            }
        }
        return -1;
    }
}
