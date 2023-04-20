package com.hainiu.demo1;
import java.util.ArrayList;
import java.util.stream.Stream;
import static jdk.nashorn.internal.objects.NativeArray.forEach;
public class Stream1 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("张三");
        lines.add("张四");
        lines.add("张五");
        lines.add("王六");
        Stream<String> stream = lines.stream();
        stream.distinct().filter(s->s.matches("^[张]\\.$")).forEach(System.out::println);
    }
}
