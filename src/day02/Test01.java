package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String s = console.next();
        // 整数正则表达式
        // [0]|([-]?[1-9]\d*)
        String regex1 = "^[0]|([-]?[1-9]\\d*)$";
        // 小数正则表达式
        // [-]?\d+\.\d+
        String regex2 = "^[-]?\\d+\\.\\d+$";
        // 判断是否是整数
        if (s.matches(regex1)) {
            int i = Integer.valueOf(s) * 10;
            System.out.println(i);
          // 判断是否是小数
        } else if (s.matches(regex2)) {
            double i = Double.valueOf(s) * 5;
            System.out.println(i);
          // 不是数字
        } else {
            System.out.println("输入的不是数字");
        }
    }
}
