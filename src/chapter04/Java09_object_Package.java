package chapter04;

import java.util.Date;

public class Java09_object_Package {
    public static void main(String[] args) {

        //TODO 面向对象 - package(包)
        // package中容纳类
        //基本语法: package 包完整路径:
        //路径中用多个"."隔开
        //java.long.Object
        //主要功能用于分类管理

        //一个类可以没有包.但是package不可以在同提供源码文件中使用多次
        //包名为了区分类名,所以一般全部都是小写
        //java.long.Object

        //Java中存在不同包的天沟通名称的类,可以使用包进行区分
        //一般情况下,在使用类的情况下,我们都会使用类的全名(包名 + 类名)
        new java.util.Date();
    }
}
