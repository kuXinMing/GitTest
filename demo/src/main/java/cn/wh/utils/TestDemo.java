package cn.wh.utils;

import java.io.*;

/**
 * @author wanghao
 * @create 2018-08-06 下午3:16
 **/

public class TestDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "test.properties";
//        readFile(TestDemo.class.getResource("").getPath()+fileName);
//        readFile(TestDemo.class.getResource("/").getPath()+fileName);
        System.out.println(TestDemo.class.getResource("/"));
        System.out.println(TestDemo.class.getClassLoader().getResource(""));
    }

    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(file));
        BufferedReader br = new BufferedReader(reader);
        System.out.println(br.readLine());
        br.close();

    }

    public void test001(){

    }
}
