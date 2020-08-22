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
        System.out.print("请输入员工的人数: ");
        int count = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 依次创建存储员工信息的文件
        for(int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i+1) + "个员工的信息");
            String s = console.next();
            // 用 , 分割每个员工的信息
            String[] ss = s.split(",");
            String name = ss[0];
            int age = Integer.valueOf(ss[1]);
            String gender = ss[2];
            int salary = Integer.valueOf(ss[3]);
            Date hiredate = sf.parse(ss[4]);
            // 创建员工对象
            Emp emp = new Emp(name, age, gender, salary, hiredate);
            // 创建输出流以写入对象信息的文件
            OutputStream os = new FileOutputStream("src/day06/" + name + ".emp");
            // String - > byte[]
            byte[] bs = emp.toString().getBytes();
            // 写入员工信息
            os.write(bs);
            // 关闭流
            os.close();
        }
    }
}
