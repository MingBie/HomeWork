package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // 存放元素"one","two","three","four"
        System.out.println(list);
        // 获取集合第二个元素并输出
        String s = list.get(1);
        System.out.println(s);
        // 将集合第三个元素设置为"3"
        list.set(2,"3");
        System.out.println(list);
        // 第二个位置上插入元素"2"
        list.add(1,"2");
        System.out.println(list);
        // 删除集合第三个元素
        list.remove(2);
        System.out.println(list);
    }
}