package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        // 当前目录的相对路径
        File file = new File("src/day06");
        // 列出所有文件和目录的名字
        String[] ss = file.list();
        // 迭代
        for(String s : ss) {
            System.out.println(s);
        }
    }
}
