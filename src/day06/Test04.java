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
        File[] files = file.listFiles();
        // 迭代
        // 判断是文件还是目录
        for(File f : files) {
            if (f.isFile() == true) {
                System.out.println(f);
            } else if (f.isDirectory() == true) {
                System.out.println(f.getName());
            }
        }
    }
}
