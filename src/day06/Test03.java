package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个目录名: ");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        // 创建目录对象
        File file = new File("src/day06/" + name);
        // 用来计数副本
        int count = 0;
        // 判断目录是否存在
        if (file.exists() == false) {
            file.mkdir();
        } else {
            // 如果目录存在，创建目录副本
            while (true) {
                // 创建目录副本对象
                File file1 = new File("src/day06/" + name + "_副本" + (++ count));
                if (file1.exists() == false) {
                    file1.mkdir();
                    break;
                }
            }
        }
    }
}
