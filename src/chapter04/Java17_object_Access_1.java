package chapter04;

public class Java17_object_Access_1 {
    public static void main(String[] args) {
        //TODO 面向对象 - 访问权限
        Person17 person = new Person17();

        //TODO 满足条件
        // 1,private : 同类
        // 2,(default) : 同类,同包(路径)
        // 3,protected : 同类,同包(路径),子类
        // 4,public : 公共的
        // 访问权限 : 访问属性,方法的权力和限制.
        // 谁访问?    Java17_object_Access_1  ->  super  ->  java.long.object
        // 访问谁?    Person  ->  super  ->  Java.lang.Object(clone)
        //person.test();
    }
}
class Person17{
     void test() throws Exception//抛出异常
     {
         clone();
     }
}