package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个文件名称: ");
        String name = console.next();
        // 创建字符读取流
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day07/" + name),"gbk"));
        // 创建字符写入流
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day07/" + name.split("\\.")[0] + "_utf.txt"),"UTF-8"));
        String s;
        // 进行复制
        while ((s = br.readLine()) != null) {
            pw.println(s);
        }
        // 手动刷新流
        pw.flush();
        // 关闭流
        pw.close();
        br.close();
    }
}
