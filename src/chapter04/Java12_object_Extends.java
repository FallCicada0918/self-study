package chapter04;

public class Java12_object_Extends {
    public static void main(String[] args) {

        //TODO 面向对象 - Extends(继承)
        // 面向对象编程中有3个非常重要的特征:继承,封装,多态
        //类存在父子关系:子类可以直接获取到父类的成员属性和成员方法
        //类的继承只能是单继承,一个类只能有一个父类,不存在多个父类
        //一个父类可以有多个字类(可以近似理解为多分叉树)

        //继承采用extends语法: 子类 extends 父类
        Child c = new Child();
        System.out.println(c.name);
        c.test();

    }
}
class  Parent{
    String name = "zhangsan";
    void test(){
        System.out.println("test");
    }

}
class Child extends Parent {

}