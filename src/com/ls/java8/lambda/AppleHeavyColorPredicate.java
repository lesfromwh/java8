package src.com.ls.java8.lambda;

/**
 * Created by liushuang on 2017/7/25.
 */
public class AppleHeavyColorPredicate implements Apple.ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
