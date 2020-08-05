package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        // 创建输入/输出字符流
        InputStreamReader bis = new InputStreamReader(new FileInputStream("src/day07/Test05.java"));
        OutputStreamWriter bos = new OutputStreamWriter(new FileOutputStream("src/day07/Test05_bak.txt"));
        char[] chs = new char[512];
        int len;
        // 进行复制
        while ((len = bis.read(chs)) != -1) {
            bos.write(chs,0,len);
        }
        // 手动刷新缓冲区
        bos.flush();
        // 关闭流
        bos.close();
    }
}
