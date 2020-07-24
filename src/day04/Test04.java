package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 创建一个List集合并添加元素0-9
        for(int i = 0;i < 10; i++) {
            list.add(i);
        }
        // 获取子集[3,4,5,6]
        List<Integer> list1 = list.subList(3,7);
        System.out.println(list1);
        //将子集元素扩大10倍 (对子集进行修改，也会改变父集的元素)
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < list1.size()*10; i++) {
            list2.add(0);
        }
        list1.addAll(list2);
        System.out.println(list1);
        // 输出原集合
        list.removeAll(list2);
        list.add(0,0);
        System.out.println(list);
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        // 删除集合中的[7,8,9]
        list.removeAll(list3);
        System.out.println(list);
    }
}
