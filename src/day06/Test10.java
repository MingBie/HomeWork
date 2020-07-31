package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入员工的个数: ");
        int count = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i+1) + "个员工的信息");
            System.out.print("请输入员工的姓名: ");
            String name = console.next();
            System.out.print("请输入员工的年龄: ");
            int age = console.nextInt();
            System.out.print("请输入员工的性别: ");
            String gender = console.next();
            System.out.print("请输入员工的工资: ");
            int salary = console.nextInt();
            System.out.print("请输入员工的入职日期(格式:yyyy-MM-dd): ");
            String hiredate = console.next();
            Date date =sf.parse(hiredate);
            // 创建员工对象
            Emp emp = new Emp(name,age,gender,salary,date);
            // 创建输出流以写入对象信息的文件
            OutputStream os = new FileOutputStream("src/day06/" + name + ".emp");
            // String - > char[]
            char[] cs = emp.toString().toCharArray();
            byte[] bs = new byte[cs.length];
            // char[] -> byte[]
            for(int j = 0; j < cs.length; j++) {
                bs[j] = (byte) cs[j];
            }
            // 写入员工信息
            os.write(bs);
        }
    }
}
