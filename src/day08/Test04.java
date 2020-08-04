package day08;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个员工的名字: ");
        String n = console.next();
        BufferedReader br = null;
        try {
            // 创建缓冲字符输入流
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/emp.txt")));
            // 创建集合用来存储emp
            Map<String,Emp> map = new HashMap<>();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String str;
            // 读取文件
            while ((str = br.readLine()) != null) {
                String[] ss = str.split(",");
                String name = ss[0];
                int age = Integer.valueOf(ss[1]);
                String gender = ss[2];
                int salary = Integer.valueOf(ss[3]);
                Date hiredate = sf.parse(ss[4]);
                // 依次创建emp并添加到map中
                Emp emp = new Emp(name,age,gender,salary,hiredate);
                map.put(emp.getName(),emp);
            }
            // 迭代
            Set<String> keys = map.keySet();
            for(String key : keys) {
                // 判断是否存在 如果存在 输出后程序直接结束
                if (key.equalsIgnoreCase(n)) {
                    System.out.println(map.get(key));
                    return;
                }
            }
            // 判断完不存在 输出
            System.out.println("查无此人");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
