package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		char[] chs = new char[5];
		// 随机生成5位的英文字母验证码(大小写混搭)
		int j; // 生成大小写的概率
		for(int i = 0; i < chs.length; i++) {
			j = (int)(Math.random() * 2);
			if (j == 0) {
				chs[i] = (char)(Math.random() * 26 + 'A');
			} else {
				chs[i] = (char)(Math.random() * 26 + 'a');
			}
		}
		// 把字符数组转换成字符串
		String s = new String(chs);
		System.out.println("验证码是: " + s);
		// 用户输入
		System.out.println("请用户输入该验证码，大小写不限制: ");
		String s1 = console.next();
		// 判断是否有效
		if (check(s,s1)) {
			System.out.println("验证码正确");
		} else
		{
			System.out.println("验证码错误");
		}
	}
	// 判断是否相等
	public static boolean check(String s,String s1) {
		// 忽略大小写
		if (s.equalsIgnoreCase(s1)) {
			return true;
		} else {
			return false;
		}
	}
	
}
