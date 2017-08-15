package src.com.ls.java8.lambda;

/**
 * Created by liushuang on 2017/7/4.
 */
public class Apple {
    private String color;
    private Integer weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    /**
     * Created by liushuang on 2017/7/25.
     */
    public static interface ApplePredicate {
        boolean test(Apple apple);
    }
}
