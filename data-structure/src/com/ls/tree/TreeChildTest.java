package com.ls.tree;

import org.junit.Test;

/**
 * @author liushuang 2017/9/8
 */
public class TreeChildTest {

    @Test
    public void demo1() {
        TreeChild<String> root = new TreeChild<>("root");
        TreeChild.Node<String> rootNode = root.getRoot();
        root.addNode("a",rootNode);
        System.out.println(root);
    }
}
