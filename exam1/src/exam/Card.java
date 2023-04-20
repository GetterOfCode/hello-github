package exam;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Card {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");

        ThreadPoolExecutor pool  = new ThreadPoolExecutor(3,
                3,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5));
        Acard acard = new Acard(list);

        pool.submit(acard);
        pool.submit(acard);
        pool.submit(acard);

    }
}
