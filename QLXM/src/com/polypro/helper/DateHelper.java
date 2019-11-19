
package com.polypro.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateHelper {
    static final SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
    
    public static Date toDate(String date, String...pattern)
        {
        try{
        if(pattern.length>0)
        {
        sdf.applyPattern(pattern[0]);
        }
        if(date==null)
        {
        return  DateHelper.now();
        }
           return sdf.parse(date);
        }catch(ParseException a)
        {
        throw new RuntimeException(a);
        }

        }
    
    public static String toString(Date date,String...pattern)
            {
            if(pattern.length>0)
            {
            sdf.applyPattern(pattern[0]);

            }
            if(date ==null)
            {
            date=DateHelper.now();

            }
            return sdf.format(date);
            }
    
    
    public static Date now()
            {
            return new Date();

            }
    public static Date addDate(Date date,int days)
            {
            date.setTime(date.getTime()+days*24*60*60*1000);
            return  date;
            }
    
    public static Date add(int days)
            {
            Date now=  DateHelper.now();
            now.setTime(now.getTime()+days*24*60*60*1000);
            return now;
            }
}
