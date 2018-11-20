package cn.baoshun.demo02;

/*
* 字符串的截取方法
* public String substring(int index):截取从参数的位置，一直到字符串末尾，返回新的字符串
* public String substring(int begin, int end):截取从begin开始到end结束的中间字符串，左闭右开区间[begin,end)
* 包含左边，不包含右边
* */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=======================");
        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("=============");

        // 下面这种写法，字符串的内容没有改变
        String strT = "Hello";
        System.out.println(strT);
        strT = "java";
        System.out.println(strT);
    }
}
