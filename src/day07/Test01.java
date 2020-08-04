package day07;

import java.io.*;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 创建流对象
            is = new FileInputStream("src/day07/myfile.txt");
            os = new FileOutputStream("src/day07/myfile_cp.txt");
            // 进行复制
            byte[] bs = new byte[1024];
            int len;
            // 当复制完时 len=-1
            while ((len = is.read(bs)) != -1) {
                // 字节数组可能未复制慢
                os.write(bs,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
