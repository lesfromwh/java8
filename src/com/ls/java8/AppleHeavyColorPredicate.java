package com.ls.java8;

/**
 * Created by liushuang on 2017/7/25.
 */
public class AppleHeavyColorPredicate implements  ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
