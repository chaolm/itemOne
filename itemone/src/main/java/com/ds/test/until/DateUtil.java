package com.ds.test.until;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author clm
 * @date 2020/12/10
 * hh
 **/
public class DateUtil {
    public static String accountCode(){
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.MILLISECOND, cal.get(Calendar.MILLISECOND) + 1);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int  second = cal.get(Calendar.SECOND);
        int msec = cal.get(Calendar.MILLISECOND);
        return "" + year + month + day + hour +second+ msec;
    }
}
