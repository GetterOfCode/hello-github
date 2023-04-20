package exam;

public class Beggar {
    public static void main(String[] args) {
        int days = 10; // 总天数
        int money = 0; // 总收入
        int currentMoney = 1; // 当天收入
        for (int i = 1; i <= days; i++) {
            money += currentMoney; // 累加当天收入
            currentMoney *= 2; // 当天收入翻倍
        }
        System.out.println("洪乞丐干" + days + "天，收入是" + money + "块钱");
    }
}
