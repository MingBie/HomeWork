package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String s = console.next();
        // \d{3,4}[-]\d{7,8}
        String regex = "^\\d{3,4}[-]\\d{7,8}$";
        // 判断
        boolean b = s.matches(regex);
        System.out.println(b);
    }
}
