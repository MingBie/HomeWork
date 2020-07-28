package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        MyRunnable1 mr1 = new MyRunnable1();
        MyRunnable2 mr2 = new MyRunnable2();
        // 创建线程
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();
    }
}
// 实现类1
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("你好");
        }
    }
}
// 实现类2
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("再见");
        }
    }
}
