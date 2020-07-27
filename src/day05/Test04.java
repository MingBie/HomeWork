package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        // 创建Map
        Map<String,String> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("请输入学生的成绩: ");
        String subject = console.next();
        // [:;]
        String regex = "[:;]";
        String[] ss = subject.split(regex);
        // 把学生成绩存入Map中
        for(int i = 0; i < ss.length; i += 2) {
            map.put(ss[i],ss[i + 1]);
        }
        // 输出物理的成绩
        String physics = map.get("物理");
        System.out.println(physics);
        // 将化学的成绩设置为96
        map.put("化学","96");
        System.out.println(map);
        // 删除英语这一项
        map.remove("英语");
        System.out.println(map);
        // 遍历key
//        Set<String> keys = map.keySet();
//        for(String key : key) {
//            String value = map.get(key);
//            System.out.println(key + " = " + value);
//        }
//        // 遍历Entry
//        Set<Map.Entry<String,String>> entries = map.entrySet();
//        for(Map.Entry<String,String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }
        // 遍历value
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println(value);
        }
    }
}
