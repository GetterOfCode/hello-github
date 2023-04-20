public class BallHigh {
    public static void main(String[] args) {
        //初始高度为100米 第10次弹起后的高度
        System.out.println(height(100,10));
        //第10次弹起后的路程
        System.out.println(sumHigh(100,10));
    }
    /**
     * 求第n次谈起的高度
     * @param startHigh
     * @param n
     * @return
     */
    private static double height(int startHigh,int n){

        return Math.pow(0.5,n)*startHigh;
    }
    /**
     * 求第n次弹起后的路程总和
     * @param startHigh
     * @param n
     * @return
     */
    private static double sumHigh(int startHigh,int n){
        double sum = startHigh;
        for(int i = 0;i<n;i++){
            if(i == n-1){
                sum +=height(startHigh,i+1);
            }else {
                sum +=2*height(startHigh,i+1);
            }
        }
        return sum;
    }
}
