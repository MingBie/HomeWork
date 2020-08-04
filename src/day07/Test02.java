package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // 创建缓冲流
            bis = new BufferedInputStream(new FileInputStream("src/day07/myfile.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("src/day07/myfile_cp2.txt"));
            byte[] bs = new byte[1024];
            int len;
            // 复制流
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs,0,len);
            }
            // 手动刷新流
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
