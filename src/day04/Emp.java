package day04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    private String name;
    private Integer age;
    private String gender;
    private Integer salary;
    private Date hierdate;
    // 构造方法
    public Emp() {
    }
    public Emp(String name, Integer age, String gender, Integer salary, Date hierdate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hierdate = hierdate;
    }
    // 重写toString方法
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf.format(this.hierdate);
        return this.name + "," + this.age + "," + this.gender + "," + this.salary + "," + date;
    }
    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) &&
                Objects.equals(age, emp.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getHierdate() {
        return hierdate;
    }

    public void setHierdate(Date hierdate) {
        this.hierdate = hierdate;
    }
}
