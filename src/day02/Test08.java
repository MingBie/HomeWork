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
        // 输入员工的人数
        System.out.println("请输入员工的人数: ");
        int count = console.nextInt();
        // 用一个数组存储员工的信息
        Person[] persons = new Person[count];
        for(int i = 0; i < count; i++) {
            // 输入每个员工的信息
            System.out.println("请输入第" + (i + 1) + "个员工的信息");
            System.out.print("请输入姓名: ");
            String name = console.next();
            System.out.print("请输入年龄: ");
            int age = console.nextInt();
            System.out.print("请输入性别: ");
            String gender = console.next();
            System.out.print("请输入工资: ");
            int salary = console.nextInt();
            persons[i] = new Person(name,age,gender,salary);
        }
        // 遍历每个员工的信息
        for(int i = 0; i < persons.length; i++) {
            System.out.println("第" + (i+1) + "个员工的信息是: " + persons[i].toString());
        }
    }
}
