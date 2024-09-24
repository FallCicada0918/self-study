package chapter05;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Java09_object{
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  比较
        //  基本数据类型，双等号比较数值
//        int i = 10;
//        int j = 10;
//        System.out.println(i == j);
//        double d = 10.0d;
//        System.out.println(i == d);
//
//        //引用数据类型，双等号比较内存地址
//        String s = "hello";// 字符串常量值
//        String s1 = "hello";
//        String s2 = new String("hello"); //开辟新的对象
//        System.out.println(s == s1);//内存地址相等，故返回true
//        System.out.println(s == s2);//内存地址不相等，故返回false
//        System.out.println(s.equals(s2));//比较字符串内容，返回true
//
//        User9 user0 = new User9();
//        User9 user1 = new User9();
//
//        System.out.println(user0 == user1);
//        System.out.println(user0.equals(user1));
//
        //包装数据类型
        //int => Integer => JVM为了操作简单，简化了很多操作
        Integer i1 = 128;
        Integer i2 = 128;
        //有缓存范围所以-128~127双等号比较返回true
        //否则返回false
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i1));
    }
}
class User9 {
    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }

}