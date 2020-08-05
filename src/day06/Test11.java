package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("src/day06");
        // 获取所有员工文件
        File[] files = file.listFiles(f -> {
            String name = f.getName();
            return name.endsWith(".emp");
        });
        // 创建集合 存储员工信息
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 依次读取 员工文件
        for (File f : files) {
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
            Emp emp = new Emp(name, age, gender, salary, hiredate);
            // 把员工对象加到集合中
            list.add(emp);
            // 关闭缓冲字符输入流
            br.close();
        }
        // 按照员工的年龄排序,年龄大的靠前,年龄小
        Collections.sort(list,
                (o1,o2) -> o2.getAge() - o1.getAge());
        System.out.println(list);
    }
}
