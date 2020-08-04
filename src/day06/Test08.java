package day06;

import java.io.*;
import java.util.Arrays;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day06/raf.dat")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day06/raf.dat")));
        // 写入 int的最大值 long的最大值
        pw.println("int最大值: 2147483647");
        pw.println("long最大值: 9223372036854775807");
        // 手动刷新缓冲区
        pw.flush();
        // 读取文件
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        // 关闭字符流
        br.close();
        pw.close();
    }
}
