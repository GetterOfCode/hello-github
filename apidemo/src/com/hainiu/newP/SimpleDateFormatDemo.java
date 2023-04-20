package com.hainiu.newP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = sdf.format(date);
        System.out.println(formatDate);
        Date parseDate = sdf.parse(formatDate);
        System.out.println(parseDate);
    }
}
