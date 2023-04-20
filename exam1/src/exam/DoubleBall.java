package exam;
import java.util.Arrays;
import java.util.Random;
/**
 * 双色球
 */
public class DoubleBall {
    public static void main(String[] args) {
        int[] red = new int[33];
        //初始化33个红球
        for (int i = 0; i < red.length; i++) {
            red[i] = i+1;
        }
        int[] blue = new int[16];
        //初始化16个蓝球
        for (int i = 0; i < blue.length; i++) {
            blue[i] = i+1;
        }
        Random rand = new Random();
        //初始化蓝球
        int bl = -1;
        int[] redTemp = new int[6];
        //保证无重复的红球 做了判断
        for (int i = 0; i < redTemp.length; i++) {
            int temp = red[rand.nextInt(33)];
            for(int j = 0; j <redTemp.length;j++){
                if (temp  == redTemp[j]) {
                    //如若已经有这个球了 就重新随机
                    temp = red[rand.nextInt(33)];
                    //重新比较有无重复的球 j赋值为-1
                    j=-1;
                }
            }
            redTemp[i] = temp;
        }
        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
        System.out.println("红球："+Arrays.toString(redTemp));
        System.out.println("蓝球："+rand.nextInt(6)+1);

    }
}
