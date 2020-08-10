package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        // \d{17}[\dXx]
        String regex = "^\\d{17}[\\dXx]$";
        // 判断是否输入正确
        String s = "";
        while (true) {
            System.out.println("请输入身份证号: ");
            String s1 = console.next();
            if (s1.matches(regex)) {
                s = s1;
                break;
            }
        }
        // 截取出生日期
        String s1 = s.substring(6,14);
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        // String -> Date
        Date date = sf.parse(s1);
        Calendar cal = Calendar.getInstance();
        // Date -> Calendar
        cal.setTime(date);
        // 计算20岁生日所在周的周三
        cal.add(Calendar.YEAR,20);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        // Calendar -> Date
        date = cal.getTime();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        // Date -> String
        String s2 = sf1.format(date);
        System.out.println(s2);
    }
}
