package com.ls.strategy;

import org.junit.Test;

/**
 * @author liushuang 2017/9/20
 */
public class StrategyTest {

    private Context context;

    @Test
    public void demo1() {
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
    }

    @Test
    public void demo2() {
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
    }

    @Test
    public void demo3() {
        //策略模式和工厂结合.调用者是需要传入一个参数就可以了.
        context = StrategyFactory.createStrategy("B");
        context.ContextInterface();
    }
}
