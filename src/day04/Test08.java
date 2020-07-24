package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 集合来存储日期
        List<Date> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个日期(格式:yyyy-MM-dd): ");
            String s = console.next();
            // String -> Date
            Date date = sf.parse(s);
            list.add(date);
        }
        System.out.println(list);
        // 排序
        Collections.sort(list);
        System.out.println(list);
    }
}
