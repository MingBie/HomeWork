package day07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/day07");
        // 读取 后缀为.obj文件
        File[] files = file.listFiles(f -> {
            String name = f.getName();
            return name.endsWith(".obj");
        });
        // 创建列表存储员工信息
        List<Emp> list = new ArrayList<>();
        for(File f : files) {
            // 创建对象输入流
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            // 读取员工信息
            Emp emp = (Emp) ois.readObject();
            // 把员工信息依次加到列表中
            list.add(emp);
            ois.close();
        }
        // 按工资多少进行排序
        Collections.sort(list,(o1, o2) -> o2.getSalary() - o1.getSalary());
        System.out.println(list);
    }
}
