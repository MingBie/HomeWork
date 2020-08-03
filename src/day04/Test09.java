package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工的信息: ");
        String s = console.next();
        // 用 ; 分割每个员工
        String[] ss = s.split(";");
        // 集合存储每个员工信息
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0; i < ss.length; i++) {
            // 用 , 分割每个员工的信息
            String[] ss1 = ss[i].split(",");
            String name = ss1[0];
            int age = Integer.valueOf(ss1[1]);
            String gender = ss1[2];
            int salary = Integer.valueOf(ss1[3]);
            Date hiredate = sf.parse(ss1[4]);
            // 创建每个员工对象
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            // 添加
            list.add(emp);
        }
        Calendar cal = Calendar.getInstance();
        // 遍历
        for(Emp emp : list) {
            System.out.println(emp);
            // Date -> Calendar
            cal.setTime(emp.getHierdate());
            // 3个月后
            cal.add(Calendar.MONTH,3);
            // 这周周五
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            // Calendar -> Date
            Date d = cal.getTime();
            // Date -> String
            String date = sf.format(d);
            System.out.println(emp.getName() + "的转正日期是: " + date);
        }
    }
}
