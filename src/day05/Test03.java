package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工的人数: ");
        int count = console.nextInt();
        List<Emp> list = new ArrayList<>();
        // 自定义字符串格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 输入每个员工的信息
        for(int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的信息");
            System.out.print("请输入员工的姓名: ");
            String name = console.next();
            System.out.print("请输入员工的年龄: ");
            int age = console.nextInt();
            System.out.print("请输入员工的性别: ");
            String gender = console.next();
            System.out.print("请输入员工的工资: ");
            int salary = console.nextInt();
            System.out.print("请输入员工的入职日期(格式:yyyy-MM-dd): ");
            String date = console.next();
            // String -> Date
            Date hiredate = sf.parse(date);
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            // 把每个员工的信息加到 list 中
            list.add(emp);
        }
        // 按定义的年龄大小进行排序（小的在前，大的在后）
        Collections.sort(list);
        System.out.println(list);
        // 排序（入职晚的在前，早的在后） Comparator比较器进行自定义
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getHiredate().compareTo(o1.getHiredate());
            }
        });
        System.out.println(list);
    }
}
