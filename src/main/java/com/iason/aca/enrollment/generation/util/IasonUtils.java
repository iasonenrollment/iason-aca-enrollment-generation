package com.iason.aca.enrollment.generation.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IasonUtils
 * Inside the package - com.iason.aca.enrollment.generation.util
 * Created Date: 5/7/2020
 * Created Time: 9:32 AM
 **/
public class IasonUtils {

    public static String randomString(String [] array){
        int rnd = new Random().nextInt(array.length - 1);
        String randomString = array[rnd];
        return randomString;
    }

    public static String getCurrentDate(){
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedDate = formatter.format(LocalDate.now());
        return formattedDate.substring(2);
    }

    public static String getCurrentTime(){
        Calendar calendar = GregorianCalendar.getInstance();
        String hourString;
        String minuteString;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        if(hour < 10){
            hourString = "0" + hour;
        }else{
            hourString = Integer.toString(calendar.get(hour));
        }
        if(minute < 10){
            minuteString = "0" + minute;
        }else{
            minuteString = Integer.toString(minute);
        }
        return hourString+minuteString;
    }
}
