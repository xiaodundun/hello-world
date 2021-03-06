package cn.baoshun.demo05;

/*
* 一个标准的类通常要满足下边四个组成部分
* 1、所有成员变量都要使用private进行修饰
* 2、为每一个成员变量编写Getter/Setter方法
* 3、编写一个无参数的构造方法
* 4、编写一个全参数的构造方法
*
* 而一个标准的类也叫做Java Bean
* */
public class Student {
    private String name;    // 名称
    private int age;    //年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
