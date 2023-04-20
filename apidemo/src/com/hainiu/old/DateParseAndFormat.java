package com.hainiu.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateParseAndFormat {
    public static void main(String[] args) throws ParseException {
        // Format
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = sdf.format(date);
        System.out.println(dateFormat);
        // Parse
        Date dateParse = sdf.parse(dateFormat);
        System.out.println(dateParse);
    }
}
