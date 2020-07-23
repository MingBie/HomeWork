package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        // 集合
        Collection<String> col = new ArrayList();
        col.add("1");
        col.add("$");
        col.add("2");
        col.add("$");
        col.add("3");
        col.add("$");
        col.add("4");
        // 迭代器遍历集合 并删除所有的"$"
        Iterator<String> i = col.iterator();
        while (i.hasNext()) {
            String s = i.next();
            // 判断是否是 $ 如果是删除 否则输出
            if (s.equals("$")) {
                // 删除
                i.remove();
            } else {
                System.out.println(s);
            }
        }
    }
}
