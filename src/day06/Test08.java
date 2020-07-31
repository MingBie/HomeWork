package day06;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("src/day06/raf.dat");
        InputStream is = new FileInputStream("src/day06/raf.dat");
    }
}
