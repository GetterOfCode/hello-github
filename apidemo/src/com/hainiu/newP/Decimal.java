package com.hainiu.newP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimal {

        public static void main(String[] args) {
            // public BigDecimal(String val) 将字符串类型的数字转换为BigDecimal对象

            BigDecimal a = new BigDecimal("1.1");
            System.out.println(a);

            // 实现小数的精确运算
            BigDecimal b = new BigDecimal("0.9");

            // 加法
            BigDecimal c = a.add(b);

            double v = c.doubleValue();
            System.out.println(v);

            // 除法
            // public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
            BigDecimal d = a.divide(b, 5, RoundingMode.HALF_UP);
            System.out.println(d);

        }



}
