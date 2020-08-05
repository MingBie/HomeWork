package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 * 
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个员工的信息: ");
        String s = console.next();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 用 , 分割员工的信息
        String[] ss = s.split(",");
        // 获取名字 并判断是否输入正确 若错误 重新输入
        String name = ss[0];
        while (!name.matches("^[a-zA-Z]{1,20}$")) {
            System.out.println("姓名输入错误，请重新输入: ");
            name = console.next();
        }
        // 获取年林 并判断是否输入正确 若错误 重新输入
        int age = Integer.valueOf(ss[1]);
        while (!((age >= 0) && (age <= 100))) {
            System.out.println("年龄输入错误，请重新输入: ");
            age = console.nextInt();
        }
        // 获取性别 并判断是否输入正确 若错误 重新输入
        String gender = ss[2];
        while (!(gender.equals("男") || gender.equals("女"))) {
            System.out.println("性别输入错误，请重新输入: ");
            gender = console.next();
        }
        // 获取工资
        int salary = Integer.valueOf(ss[3]);
        // 获取入职日期
        Date hiredate = sf.parse(ss[4]);
        // 创建员工对象
        Emp emp = new Emp(name,age,gender,salary,hiredate);
        // 创建缓冲字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/day08/emp.txt",true));
        // 写入信息
        osw.write("\n");
        // 写入员工信息字符串
        osw.write(emp.toString());
        // 关闭流
        osw.close();
    }
}
