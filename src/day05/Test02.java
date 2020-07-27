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
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // 栈长度
        int size = stack.size();
        for(int i = 0; i < size; i++) {
            // 依次出栈
            int j = stack.pop();
            System.out.println(j);
        }
    }
}
