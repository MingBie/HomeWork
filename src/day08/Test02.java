package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串: ");
            String s = console.next();
            // 输入exit退出程序
            if (s.equals("exit")) {
                break;
            }
            // 创建缓冲字符输出流
            PrintWriter ps = null;
            try {
                ps = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day08/note.txt",true),"gbk"));
                // 写入文件中
                ps.println(s);
                // 手动刷新缓冲流
                ps.flush();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                // 关闭流
                if (ps != null) {
                    ps.close();
                }
            }
        }
    }
}
