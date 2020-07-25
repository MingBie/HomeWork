package day05;

import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        // 创建一个栈
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        // 可以用forEach遍历 Stack(类)继承Collection(接口)
        for(Integer i : stack) {
            System.out.println(i);
        }
    }
}
