package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
/*public class Test11 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/day06/emp.dat");
        List<Emp> list = new ArrayList<>();
        byte[] bs = new byte[];
        int i;
        int count = 0;
        while ((i = is.read()) != -1) {
            bs[count++] = (byte)i;
        }
        String emp1 = new String(bs);
    }
}*/
