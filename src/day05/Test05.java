package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        // 创建Map
        Map<String,Integer> map = new HashMap<>();
        String str = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;" +
                "前端:green;前端:nick;程序:钱七;销售:alice";
        String regex = "[:;]";
        // String -> String[]
        String[] ss = str.split(regex);
        // 把信息存入Map
        for(int i = 0; i < ss.length; i += 2) {
            // 获取value
            Integer value = map.get(ss[i]);
            // 判断key是否存在
            if (value == null) {
                value = 0;
            }
            // value + 1
            map.put(ss[i],value + 1);
        }
        System.out.println(map);
    }
}
