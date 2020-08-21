package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入一个文件名: ");
		String name = console.next();
		copy1(name);
		copy2(name);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		// 创建字节流
		FileInputStream fis = new FileInputStream("src/day06/" + name);
		String[] ss = name.split("\\.");
		FileOutputStream fos = new FileOutputStream("src/day06/" + ss[0] + "_copy.txt");
		// 单个字符形式复制
		int a;
		while ((a = fis.read()) != -1) {
			fos.write(a);
		}
		fos.flush();
		fis.close();
		fos.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
		// 创建字节流
		FileInputStream fis = new FileInputStream("src/day06/" + name);
		String[] ss = name.split("\\.");
		FileOutputStream fos = new FileOutputStream("src/day06/" + ss[0] + "_copy.txt");
		// 字节数组形式复制
		int len;
		byte[] bs = new byte[1024];
		while ((len = fis.read(bs)) != -1) {
			fos.write(bs,0,len);
		}
		fos.flush();
		fis.close();
		fos.close();
	}
}
