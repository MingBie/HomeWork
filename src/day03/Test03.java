package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入您的生日(格式:yyyy-MM-dd): ");
        String s = console.next();
        // 把字符串时间转换成 Date
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse(s);
        // Date -> long
        long time = date.getTime();
        // 获得现在时间
        Date date1 = new Date();
        long time1 = date1.getTime();
        // 时间差除以一周的毫秒数
        int i = (int)((time1 - time)/7/24/60/60/1000);
        System.out.println("到现在为止经过了: " + i + "周");
    }
}
