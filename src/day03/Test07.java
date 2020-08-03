package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工的数量: ");
        int count = console.nextInt();
        // 集合存储Emp对象
        Collection<Emp> col = new ArrayList<>();
        // Date 输入格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        // 存入每个员工的信息
        for(int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i+1) + "员工的信息");
            String s = console.next();
            // 用 , 分割 每个员工信息
            String[] ss = s.split(",");
            String name = ss[0];
            int age = Integer.valueOf(ss[1]);
            String gender = ss[2];
            int salary = Integer.valueOf(ss[3]);
            Date hiredate = sf.parse(ss[4]);
            // 创建每个员工
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            // 判断员工是否已经存在
            if (col.contains(emp)) {
                System.out.println("该用户已存在");
            } else {
                col.add(emp);
            }
        }
        // 迭代输出
        Iterator<Emp> i = col.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
