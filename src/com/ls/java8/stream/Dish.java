package src.com.ls.java8.stream;

/**
 * create by liushuang Date:2017/8/15 Time:18:03
 * java8 71页
 */
public class Dish {
    private final String name;
    private final boolean vegetarian;//素食者
    private final int calories;//卡路里
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type {MEAT, FISH, OTHER}
}
