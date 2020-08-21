package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个文件名: ");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        // 创建文件对象
        File file = new File("src/day06/" + name);
        // 用来计数副本
        int count = 0;
        // 判断文件是否存在
        if (file.exists() == false) {
            file.createNewFile();
        } else {
            // 如果文件存在，创建文件副本
            while (true) {
                // 获得需要创建的文件名字和文件类型
                String[] ss = name.split("\\.");
                // 创建文件副本对象
                File file1 = new File("src/day06/" + ss[0] + "_副本" + (++ count) + "." + ss[1]);
                if (file1.exists() == false) {
                    file1.createNewFile();
                    break;
                }
            }
        }
    }
}
