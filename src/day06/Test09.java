package day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建字符输出流
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day06/note.txt",true)));
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串: ");
            String s = console.next();
            // 判断是否是 exit
            if (s.equals("exit")) {
                break;
            }
            // 不是写入文件
            pw.println(s);
        }
        // 手动刷新缓冲区
        pw.flush();
        // 关闭流
        pw.close();
    }
}
