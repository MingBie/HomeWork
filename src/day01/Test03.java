package day01;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 
 * @author Bonnie
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		Scanner console = new Scanner(System.in);
		System.out.println("请输入一个字符串: ");
		String str = console.next();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String s = sb.toString();
		if (str.equals(s)) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}
/*		if (check(str)) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}*/
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
/*	public static boolean check(String str){
		char[] chs1 = new char[str.length()]; // 用来存放倒叙字符数组
		// 进行倒叙
		for(int i = 0; i < str.length(); i++) {
			chs1[str.length() - i - 1] = str.charAt(i);
		}
		String s = new String(chs1); // 把字符数组变成字符串
		System.out.println(s);
		// 判断倒叙后的字符串是否与原字符串相等
		if (s.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}*/
}
