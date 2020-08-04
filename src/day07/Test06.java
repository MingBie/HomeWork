package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个文件名: ");
        String name = console.next();
        File file = new File("src/day07/" + name + ".txt");
        // 新建文件
        file.createNewFile();
        // 写文件
        while (true) {
            System.out.println("请输入字符串: ");
            String s = console.next();
            // 判断是否退出
            if (s.equals("exit")) {
                break;
            }
            // 将输入的字符串写入文件
            PrintWriter bw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file,true),"gbk"));
            bw.write(s);
            bw.write('\n');
            // 手动刷新缓存区
            bw.flush();
            // 关闭流
            bw.close();
        }
    }
}
