package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("src/day06");
        // 获取当前目录下所有文件
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        // 迭代输出文件的名字
        for(File f : files) {
            System.out.println(f.getName());
        }
    }
}
