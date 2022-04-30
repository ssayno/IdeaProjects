package com.sayno.work;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        System.out.println(date);
        System.out.println(new Date());
        System.out.println(date.getTime());
//        millisecond
        long millisecond = date.getTime();
        millisecond += 864000 * 1000;
        System.out.println(new Date(millisecond));
//        format date below.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm:ss:SSS");
        String data_str = sdf.format(date);
        System.out.println(data_str);
//        String to date, and when the date string is over the time, like( 61 min ), it can be adjust automatically.
        String birthday = "2001-09-06 00-22:22:22:452";
        Date birthday_date = sdf.parse(birthday);
        System.out.println(birthday_date);
//        number format
        long money = 1654646546; // double also is ok.
        String money_str = NumberFormat.getInstance().format(money);
        System.out.println(money_str);
    }
}
