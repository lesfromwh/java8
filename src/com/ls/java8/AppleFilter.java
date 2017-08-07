package com.ls.java8;


import org.junit.Test;

import java.io.FilenameFilter;
import java.net.PortUnreachableException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by liushuang on 2017/7/4.
 */
public class AppleFilter {

    public static void main(String[] args) {
        new ArrayList<Apple>();
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    /**
     * 方法作为Predicate参数传递进去.
     */
    public static List<Apple> appleFilter(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> list = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                list.add(apple);
            }
        }
        return list;
    }

    @Test
    public void page13() {
        List<Apple> list = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor("green");
        list.add(apple1);
        List<Apple> filter = appleFilter(list, (Apple a) -> "green".equals(a.getColor()));
    }

    @Test
    public void sss() {
        ArrayList<Apple> list = getApplesList();
        System.out.println(list);
//        list.sort((Apple a,Apple b)->a.getWeight().compareTo(b.getWeight()));
        list.sort((Apple a, Apple b) -> a.getWeight() - (b.getWeight()));
        System.out.println(list);
    }

    //生产一个list<apple>
    private ArrayList<Apple> getApplesList() {
        Apple apple1 = new Apple();
        apple1.setWeight(150);
        Apple apple2 = new Apple();
        apple2.setWeight(100);
        ArrayList<Apple> list = new ArrayList<>();
        list.add(apple1);
        list.add(apple2);
        return list;
    }

    @Test
    public void page18() {
        List<Apple> list = getApplesList();
        List<Apple> apples = list.stream().filter((Apple a) -> a.getWeight() > 90).collect(toList());
        System.out.println(apples);
    }

    @Test
    public void page37() {
//        (int x,int y)->{System.out.println("结果");System.out.println(x+y);}
    }

}












