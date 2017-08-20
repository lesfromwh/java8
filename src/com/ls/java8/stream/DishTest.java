package src.com.ls.java8.stream;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * create by liushuang Date:2017/8/15 Time:18:06
 */
public class DishTest {
    private List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),//猪肉
            new Dish("beef", false, 700, Dish.Type.MEAT),//牛肉
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),//french fries
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),//大虾
            new Dish("salmon", false, 450, Dish.Type.FISH));//大马哈鱼

    @Test
    public void demo1() {
        //筛选小于400卡路里的 java7写法
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : menu) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        //排序
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        //打印菜名列表
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        System.out.println(lowCaloricDishesName);
    }

    @Test
    //java8写法
    public void demo2() {

        List<String> lowCaloricDishesName = menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());//import static java.util.stream.Collectors.toList;
        System.out.println(lowCaloricDishesName);
    }

    @Test
    //java8写法,利用多核架构.替换stream()
    public void demo3() {
        List<String> lowCaloricDishesName = menu.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());//import static java.util.stream.Collectors.toList;
        System.out.println(lowCaloricDishesName);
    }

    @Test
    //流只能被消费一次
    public void demo4() {
        List<String> list = Arrays.asList("java8","ls","ll");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);//第二次抛出异常 stream has already been operated upon or closed  已经被操作或者关闭了.
    }
}
