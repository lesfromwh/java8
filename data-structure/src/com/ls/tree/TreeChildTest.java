package com.ls.tree;

import org.junit.Test;

/**
 * @author liushuang 2017/9/8
 */
public class TreeChildTest {

    @Test
    public void demo1() {
        TreeChild<String> tree = new TreeChild<>("root");
        TreeChild.Node<String> rootNode = tree.getRoot();
        tree.addNode("a",rootNode);
        tree.addNode("b",rootNode);
//        tree.addNode("a1",);
        System.out.println(tree);
    }
}
