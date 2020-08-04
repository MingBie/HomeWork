package day07;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.print("输入员工的人数:");
        int count = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 依次创建员工存入文件中
        for(int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i+1) + "个员工的信息:");
            String s = console.next();
            // 用 , 分割 员工信息
            String[] ss = s.split(",");
            String name = ss[0];
            int age = Integer.valueOf(ss[1]);
            String gender = ss[2];
            int salary = Integer.valueOf(ss[3]);
            Date hiredate = sf.parse(ss[4]);
            // 创建员工对象
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            // 创建对象写入流
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(new FileOutputStream("src/day07/" + name + ".obj"));
                // 写入对象
                oos.writeObject(emp);
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (oos != null) {
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
