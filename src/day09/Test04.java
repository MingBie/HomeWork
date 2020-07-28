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
        MyThread mt = new MyThread();
        mt.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long time = date.getTime();
        // 从当前时间连续输出10秒内的时间
        for(int i = 0; i < (10 * 1000); i += 1000) {
            date.setTime(time + i);
            String stime = sf.format(date);
            System.out.println(stime);
        }
    }
}
