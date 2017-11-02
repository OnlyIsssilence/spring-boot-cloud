package com.onlyisssilence.muya.utils;

import java.util.Date;

/**
 * Author: MuYa
 * Date  : 2017/11/2
 * Description:
 */
public class DateUtils {
    public static String getCurrentTime(){
        Date date = new Date();
        return  date.toString();
    }
}
