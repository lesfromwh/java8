package src.com.ls.java8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liushuang on 2017/7/13.
 */
public class MyDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(date);
        System.out.println(format);
    }
}
