package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println("请输入需要删除的文件名或目录名: ");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        // 创建文件/目录对象
        File file = new File("src/day06/" + name);
        deleteFile(file);
    }
    // （递归思想）删除文件/目录
    private static void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for(File f : files) {
                deleteFile(f);
            }
        }
        file.delete();
    }
}
