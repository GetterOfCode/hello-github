import java.util.Random;

public class HanRandoms {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i <10;i++) {
             arr[i]= rand.nextInt(100) + 1;
        }
        for (int i : arr) {
            System.out.print(i+" ");

        }
        System.out.println();
        max(arr);

    }

    /**
     * 求数组中的最大值
     * @param arr
     */
    private static void max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
