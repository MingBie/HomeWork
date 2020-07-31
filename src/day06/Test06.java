package day06;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("src/day06");
        // 获取当前目录下所有文件的名字
        String[] ss = file.list();
        // 迭代输出
        for(String s : ss) {
            System.out.println(s);
        }
    }
}
