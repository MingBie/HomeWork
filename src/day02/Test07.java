package day02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个数学计算表达式: ");
        String s = console.next();

        // [+|-|*|/]
        String regex = "[+|-|*|/]";
        // 截取
        String[] s1 = s.split(regex);
        System.out.println(Arrays.toString(s1));

        // [^+|-|*|/]
        String regex1 = "[^+|-|*|/]";
        String[] s2 = s.split(regex1);
        System.out.println(Arrays.toString(s2));

        // 把每个字符串转变成数值
        double[] arr = new double[s1.length];
        for(int i = 0; i < s1.length; i++) {
            arr[i] = Double.valueOf(s1[i]);
        }
        // 判断加减乘除 再计算
        double sum = arr[0];
        for(int i = 0; i < s2.length; i++) {
            if (s2[i].equals("+")) {
                for(int j = 1; j < s1.length; j++) {
                    sum += arr[j];
                }
            } else if (s2[i].equals("-")) {
                for (int j = 1; j < s1.length; j++) {
                    sum -= arr[j];
                }
            } else if (s2[i].equals("*")) {
                for (int j = 1; j < s1.length; j++) {
                    sum *= arr[j];
                }
            } else if (s2[i].equals("/")){
                for (int j = 1; j < s1.length; j++) {
                    sum /= arr[j];
                }
            }
        }
        System.out.println(sum);
    }
}
