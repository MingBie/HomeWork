package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("大家好!");
		// 将"大家好!"修改为:"大家好!我是程序员!"并输出
		s.append("我是程序员!");
		System.out.println(s);
		// 将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
		s.delete(4,10);
		s.append("我是优秀的程序员!");
		System.out.println(s);
		// 修改为:"大家好!我是牛牛的程序员!"并输出
		s.replace(4,13,"我是牛牛的程序员!");
		System.out.println(s);
		// 修改为:"我是牛牛的程序员!"并输出
		s.delete(0,4);
		System.out.println(s);
	}
}
