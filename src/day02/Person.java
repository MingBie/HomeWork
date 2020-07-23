package day02;

import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 * @author Bonnie
 *
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int salary;

    public Person() {

    }
    // 全参数(该构造方法的参数用于设置所有属性)构造方法
    public Person(String name,int age,String gender,int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    // 重写toString方法，返回字符串格式如:"张三,25,男,5000"
    public String toString() {
        return this.name + "," + this.age + "," + this.gender + "," + this.salary;
    }
    // 重写equals方法，要求名字相同就认为内容一致
    public boolean equals(Object obj) {
        // 判断地址是否相同
        if (this == obj) {
            return true;
        }
        // 判断类型是否相同，如果不相同返回false
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(this.name, person.name);
    }
}
