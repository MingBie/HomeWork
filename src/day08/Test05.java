package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为short,长度为2个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        try {
            // 创建输入流
            RandomAccessFile raf = new RandomAccessFile("src/day08/emp.dat","r");
            SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
            // 创建集合用来存储员工
            List<Emp> list = new ArrayList<>();
            int len;
            int a;
            byte[] bs = new byte[32];
            byte[] bs1 = new byte[10];
            // 依次读取员工信息
            for(int i = 0; i < 10; i++) {
                // 读取姓名
                len = raf.read(bs);
                String name = new String(bs,0,len);
                // 读取年龄
                short age = raf.readShort();
                // 读取性别
                len = raf.read(bs1);
                String gender = new String(bs1,0,len);
                // 读取工资
                int salary = raf.readInt();
                // 读取入职日期
                long l = raf.readLong();
                Date hiredate = sf.parse(new String("" + l));
                // 创建员工
                Emp emp = new Emp(name,age,gender,salary,hiredate);
                list.add(emp);
            }
            // 按照员工入职从晚到早进行排序
            Collections.sort(list,(l1, l2) -> l2.getHiredate().compareTo(l1.getHiredate()));
            // 迭代输出
            for(Emp emp : list) {
                System.out.println(emp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
