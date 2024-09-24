package chapter04;

public class Java26_object {
    public static void main(String[] args) {

        //TODO 面向对象 作用域
        User26 user = new User26();
        user.test();

    }

}
class Person26 {
    public static String name = "zhangsan";
}
class User26 extends Person26 {
    public static String name = "lisi";

//    public void test() {
//        String name = "wangwu";
//
////        如果属性和(局部)变量的名称相同,访问时如果不加修饰符,那么休闲访问(局部)变量.
//        System.out.println(super.name);
//        System.out.println(name);
//    }
    public static void test() {
        System.out.println(Person26.name);
        System.out.println(name);
    }
}
