package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        // 匿名内部类 创建 线程1
        Thread mt1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println("你好");
                }
            }
        };
        // 线程2
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println("再见");
                }
            }
        };
        Thread mt2 = new Thread(r);
        mt1.start();
        mt2.start();
    }
}
