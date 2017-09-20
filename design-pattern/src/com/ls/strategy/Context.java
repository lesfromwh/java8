package com.ls.strategy;

/**
 * @author liushuang 2017/9/20
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }
}
