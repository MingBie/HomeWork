package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        // 创建一个匿名内部线程
        Thread t = new Thread() {
            public void run() {
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                while (true) {
                    // 获得当前时间
                    Date date = new Date();
                    // Date -> String
                    String s = sf.format(date);
                    System.out.println(s);
                    // 延迟1秒
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}