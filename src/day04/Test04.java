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
        // 将子集元素扩大10倍 (对子集进行修改，也会改变父集的元素)
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < list1.size(); i++) {
            list1.set(i,list1.get(i)*10);
        }
        System.out.println(list1);
        // 输出原集合 (把扩大的元素复原)
        for(int i = 3; i < 7; i++) {
            list.set(i,list.get(i)/10);
        }
        System.out.println(list);
        // 删除集合中的[7,8,9]
        List<Integer> list3 = list.subList(7, 10);
        list3.clear();
        System.out.println(list);
    }
}
