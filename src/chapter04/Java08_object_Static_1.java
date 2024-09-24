package chapter04;

public class Java08_object_Static_1 {
    public static void main(String[] args) {

        //TODO 面向对象 - 静态

        //TODO 先有类,再有对象
        // 成员方法可以访问静态属性和静态方法
        // 静态方法不允许访问成员属性与成员方法
        Test t = new Test();
        t.sex = "女";
        t.test();
//        t.test1();
//        Test.test1();
    }
}
class Test{

    String name;//成员属性
    static String sex;//静态属性
    void test()//成员方法,与对象相关
    {
        test1();
        System.out.println(sex);
        //System.out.println("test...");
    }
    static void test1()//静态方法,与Test类型相关
    {
        System.out.println("test1");
    }

}

