package day02;

import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String s = "123,456,789,012";
        // 拆分的正则表达式
        // [,]
        String regex ="[,]";
        // 拆分
        String[] s1 = s.split(regex);
        System.out.println(Arrays.toString(s1));
    }
}
