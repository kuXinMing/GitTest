package cn.wh.controller;

/**
 * @author wanghao
 * @create 2018-08-06 下午3:16
 **/
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(TestDemo.class.getResource("").getPath());
        System.out.println(TestDemo.class.getResource("/").getPath());
    }
}
