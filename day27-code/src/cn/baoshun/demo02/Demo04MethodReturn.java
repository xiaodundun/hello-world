package cn.baoshun.demo02;

/*
求出两个数字之和
* */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("返回值是：" + num);
        System.out.println("==============");
        printSum(100, 200);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("返回值是：" + result);
    }
}
