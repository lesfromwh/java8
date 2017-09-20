package com.ls.strategy;

/**
 * @author liushuang 2017/9/20
 */
public class StrategyFactory {

    public static Context createStrategy(String s) {
        switch (s) {
            case "A" :
                return new Context(new ConcreteStrategyA());
            case "B" :
                return new Context(new ConcreteStrategyB());
        }

        return new Context(new ConcreteStrategyA());
    }
}
