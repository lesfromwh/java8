package src.com.ls.java8.lambda;

/**
 * Created by liushuang on 2017/7/25.
 */
public class AppleHeavyWeightPredicate implements Apple.ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
