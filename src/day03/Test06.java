package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<String>();
        col.add("one");
        col.add("two");
        col.add("three");
        // 集合的元素个数
        int size = col.size();
        System.out.println(size);
        // 判断是否包含字符串"four"
        boolean b = col.contains("four");
        System.out.println(b);
        // 判断集合是否不含有任何元素
        boolean b1 = col.isEmpty();
        System.out.println(b1);
        // 清空集合
        col.clear();
        // 集合的元素个数
        int size1 = col.size();
        System.out.println(size1);
        // 判断集合是否不含有任何元素
        boolean b2 = col.isEmpty();
        System.out.println(b2);
    }
}
