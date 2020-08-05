package day12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，id从1开始，自动为每个员工分配。之后按照emp.xml的格式将
 * 这些员工写入到emplist.xml文档中
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为int,长度为4个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为字符串，长度为30个字节，编码为:UTF-8  内容格式:yyyy-MM-dd(由于长度30，后面可能会存在空白，注意去除)
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException, ParseException {
        RandomAccessFile raf = new RandomAccessFile("src/day12/emp.xml","r");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        int a;
        int len;
        byte[] bs = new byte[32];
        byte[] bs1 = new byte[10];
        byte[] bs2 = new byte[30];
        for(int i = 0; i < 10; i++) {
            len = raf.read(bs);
            String name = new String(bs,0,len);
            System.out.println(name);
            int age = raf.readInt();
            System.out.println(age);
            len = raf.read(bs1);
            String gender = new String(bs1,0,len);
            System.out.println(gender);
            int salary = raf.readInt();
            System.out.println(salary);
            len = raf.read(bs2);
            Date hiredate = sf.parse(new String(bs2,0,len));
            System.out.println(hiredate);
            //Emp emp = new Emp(name,age,gender,salary,hiredate);
        }
    }
}
