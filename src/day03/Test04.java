package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入生产日期（格式:yyyy-MM-dd)");
        String s = console.next();
        System.out.println("请输入保质期的天数:");
        int day = console.nextInt();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 把字符串转换成Date
        Date date = sf.parse(s);
        Calendar cal = Calendar.getInstance();
        // Date -> Calendar
        cal.setTime(date);
        // 计算促销日期
        cal.add(Calendar.DAY_OF_MONTH,day);
        cal.add(Calendar.WEEK_OF_MONTH,-2);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        // Calendar -> Date
        date = cal.getTime();
        // 把日期转换成 yyyy-MM-dd格式
        String s1 = sf.format(date);
        System.out.println(s1);
    }
}
