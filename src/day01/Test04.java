package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入一个email地址: ");
		String s = console.next();
		if (s.indexOf('@') != -1) {
			int index = s.indexOf('@'); // 获得 @ 的下标
			String s1 = s.substring(0,index); // 截取 @ 之前的字符串
			System.out.println("用户名是: " + s1);
		} else {
			System.out.println("email输入错误!");
		}
	}
}
