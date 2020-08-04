package day08;

import java.io.*;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建缓冲输入/输出流
        FileInputStream fis;
        BufferedInputStream bis = null;
        FileOutputStream fos;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("src/day07/myfile.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("src/day08/myfile_bak.txt"));
            // 进行复制（字节数组）
            int len;
            byte[] bs = new byte[1024];
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs,0,len);
            }
            // 手动刷新缓冲区
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
