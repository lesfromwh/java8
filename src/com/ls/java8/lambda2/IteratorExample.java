package src.com.ls.java8.lambda2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author liushuang 2017/11/16
 */
public class IteratorExample {

    List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

    @Test
    public void iterator() {
//        for (String feature : features) {
//            System.out.println(feature);
//        }
        features.forEach(n -> System.out.println(n));
    }

    @Test
    public void filter() {
        List<String> list = features.stream().filter(n -> n.equals("Lambdas")).collect(toList());
        System.out.println(list);
    }

    /**
     * list.stream().collect(Collectors.toMap(xxx))
     */
    @Test
    public void map() {
        User user1 = new User("ls", 23, "1");
        User user2 = new User("ls", 24, "1");
        List<User> list = Arrays.asList(user1, user2);
//        Map<String, Integer> collect = list.stream().collect(Collectors.toMap((p) -> p.getId(), User::getAge));
//        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(p->p.getId()+p.getName(), User::getAge));
        //报错. java.lang.IllegalStateException: Duplicate key 23
        //在后面加上,(key1, key2) -> key2就不报错了.
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(p -> p.getId(), User::getAge, (key1, key2) -> key2));
        collect.forEach((k, v) -> System.out.println(k + " " + v));

    }

    class User {
        private String name;
        private Integer age;
        private String id;

        public User(String name, Integer age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}
