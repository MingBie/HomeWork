package day06;

import java.io.*;
import java.net.URISyntaxException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后输出该集合中每个员工信息。
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * name为字符串，长度为32个字节，编码为:UTF-8
 * age为int,长度为4个字节
 * gender为字符串，长度为10个字节，编码为:UTF-8
 * salary为int,长度为4个字节
 * hiredate为字符串，格式"yyyy-MM-dd"，长度为30个字节，编码为:UTF-8
 * 格式可参考当前包中emp.jpg图
 * 提示:
 * 使用RandomAccessFile读取字符串时，例如name,可以先读取32个字节，再按照UTF-8
 * 转换为字符串，读取age时可以直接使用readInt方法。依次类推。
 *
 * @author Bonnie
 */
public class Test13 {
    public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
        // 使用类加载器加载当前包中的emp.dat文件
        File file = new File(Test13.class.getClassLoader().getResource("day06/emp.dat").toURI());
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        // 用来存储读取的员工
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        int len;
        int i;
        byte[] chs = new byte[32]; // 用来读取名字
        byte[] chs1 = new byte[10]; // 用来读取性别
        byte[] chs2 = new byte[30]; // 用来读取入职日期
        while ((len = raf.read(chs)) != -1) {
        	// 读取名字
			String name = new String(chs, 0, len);
			// 读取年龄
			int age = raf.readInt();
			// 读取性别
			len = raf.read(chs1);
			String gender = new String(chs1, 0, len);
			// 读取工资
			int salary = raf.readInt();
			// 读取入职日期
			len = raf.read(chs2);
			Date hiredate = sf.parse(new String(chs2, 0, len));
			Emp emp = new Emp(name, age, gender, salary, hiredate);
			list.add(emp);
		}
        raf.close();
        for(Emp emp : list) {
			System.out.println(emp);
		}
    }
}
