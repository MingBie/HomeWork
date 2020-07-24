package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 添加元素0-9
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        // 将集合转换为一个Integer数组
        Integer[] arr = list.toArray(new Integer[0]);
        for(Integer i : arr) {
            System.out.println(i);
        }
    }
}
