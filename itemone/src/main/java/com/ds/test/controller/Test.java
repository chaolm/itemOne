/*
package com.ds.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Calendar;
import java.util.GregorianCalendar;

*/
/**
 * @author clm
 * @date 2020/12/10
 * hh
 **//*

public class Test {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public static void main(String[] args) {
*/
/*
        stringRedisTemplate.opsForValue().set("aaa", "111");
*//*

       */
/* Calendar  cal = new GregorianCalendar();
            cal.set(Calendar.MILLISECOND, cal.get(Calendar.MILLISECOND) + 1);
            System.out.println(toDateString(cal));*//*

    }
    public static String toDateString(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int  second = calendar.get(Calendar.SECOND);
        int msec = calendar.get(Calendar.MILLISECOND);
        return "" + year + month + day + hour +second+ msec;
    }


    public  void test1()  {

        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");

    }

}
*/
