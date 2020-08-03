package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 输入员工的信息
        System.out.println("请输入员工的信息: ");
        String s = console.next();
        // 用 ; 分割每个员工
        String[] ss = s.split(";");
        // 用一个数组存储员工
        Person[] persons = new Person[ss.length];
        for (int i = 0; i < ss.length; i++) {
            // 用 , 分割员工信息
            String[] s2 = ss[i].split(",");
            // 获取每个员工信息
            String name = s2[0];
            int age = Integer.valueOf(s2[1]);
            String gender = s2[2];
            int salary = Integer.valueOf(s2[3]);
            // 给数组每个员工元素存入员工信息
            persons[i] = new Person(name,age,gender,salary);
        }
        // 迭代员工数组
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
