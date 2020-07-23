package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入一个文件名称: ");
		String s = console.next();
		// [a-z]+\.
		String regex = "[a-z]+\\.";
        // 获得当前时间
		Date date = new Date();
		long time = date.getTime();
		// 替换
		String s1 = s.replaceAll(regex,time + ".");
		System.out.println(s1);
	}
}
