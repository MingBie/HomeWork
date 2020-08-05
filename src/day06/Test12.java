package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("src/day06");
        // 获取所有员工文件
        File[] files = file.listFiles(f -> {
                String name = f.getName();
                return name.endsWith(".emp");
        });
        // 创建集合 存储员工信息
        Map<String,Emp> map = new HashMap<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 依次读取 员工文件
        for(File f : files) {
            // 创建缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            // 整行读取
            String s = br.readLine();
            String[] ss = s.split(",");
            String name = ss[0];
            int age = Integer.valueOf(ss[1]);
            String gender = ss[2];
            int salary = Integer.valueOf(ss[3]);
            Date hiredate = sf.parse(ss[4]);
            // 创建员工对象
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            // 把员工对象加到集合中
            map.put(emp.getName(),emp);
            // 关闭缓冲字符输入流
            br.close();
        }
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个员工的名字: ");
        String n = console.next();
        Set<String> keys = map.keySet();
        Calendar cal = Calendar.getInstance();
        // 迭代key
        for(String key : keys) {
            // 判断员工是否存在
            if (key.equals(n)) {
                Emp e = map.get(key);
                // 获取入职20周年的纪念日当周的周六的日期
                cal.setTime(e.getHiredate());
                cal.add(Calendar.YEAR,20);
                cal.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
                Date d = cal.getTime();
                String hiredate = sf.format(d);
                // 输出
                System.out.println(e.getName() + "," + e.getAge() + "," + e.getSalary() + "," + hiredate);
                // 结束程序
                return;
            }
        }
        System.out.println("查无此人");
    }
}
