package Demo;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        PrintWriter pw = null;
        try {
            // 创建缓冲字符输入/输出流
            br1 = new BufferedReader(new InputStreamReader(new FileInputStream("src/Demo/a.txt")));
            br2 = new BufferedReader(new InputStreamReader(new FileInputStream("src/Demo/b.txt")));
            pw = new PrintWriter(new PrintWriter(new FileOutputStream("src/Demo/c.txt")));
            String s1;
            StringBuilder sb1 = new StringBuilder(); // 存储从 a.txt 读取的单词
            String s2;
            StringBuilder sb2 = new StringBuilder(); // // 存储从 b.txt 读取的单词
            // 读取 a.txt 中的单词
            while ((s1 = br1.readLine()) != null) {
                sb1.append(s1 + " "); // 以空格 隔开
            }
            // 读取 a.txt 中的单词
            while ((s2 = br2.readLine()) != null) {
                sb2.append(s2 + " "); // 以空格 隔开
            }
            // 分别用空格切成 单词数组
            String[] ss1 = sb1.toString().split("\\s");
            String[] ss2 = sb2.toString().split("\\s");
            // 判断 单词数组的长度（取短的）
            int length;
            if (ss1.length < ss2.length) {
                length = ss1.length;
            } else {
                length = ss2.length;
            }
            // 交替添加 并以空格隔开
            // 先添加相等长度的单词
            StringBuilder s = new StringBuilder();
            for(int i = 0; i < length; i++) {
                s.append(ss1[i] + " " + ss2[i]);
                if (i < length -1) {
                    s.append(" ");
                }
            }
            // 再添加另一个单词数组剩余的单词
            // 判断哪个 单词数组 有剩余
            if (length == ss1.length) {
                for(int i = length; i < ss2.length; i++) {
                    s.append(" " + ss2[i]);
                }
            }
            if (length == ss2.length) {
                for(int i = length; i < ss1.length; i++) {
                    s.append(" " + ss1[i]);
                }
            }
            // 写入 c.txt 文件中
            pw.write(s.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (br1 != null) {
                try {
                    br1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br2 != null) {
                try {
                    br2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
    }
}
