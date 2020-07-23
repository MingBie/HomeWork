package day03;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        // 当前系统时间
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        // 3天后
        date.setTime(time + 3l*24*60*60*1000);
        System.out.println(date);
    }
}
