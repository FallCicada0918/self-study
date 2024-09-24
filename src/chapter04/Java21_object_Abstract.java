package chapter04;

public class Java21_object_Abstract {
    public static void main(String[] args) {

        //TODO 面向对象 - 抽象 - Abstract
        //  抽象类:  不完整的类就是抽象类
        //          abstract class 类名
        //          因为类不完整,所以无法直接构建对象
        // 抽象方法: 只有声明,没有实现的方法
        //         abstract 返回值类型 方法名(参数)
        //无抽象属性

        //分析问题:对象(具体) => 类(抽象)
        //编写代码:类(抽象) => 对象(具体)

        //如果一个类中含有抽象方法,那么这个类是抽象类
        //如果一个类是抽象类,他的方法不一定是抽象方法
        //抽象类无法直接构建对象,但是可以通过子类间接构造对象
        //如果抽象类中含有抽象方法,那么子类继承抽象类,需要重写抽象方法,将方法补充完整
//        Person21 person21 = new Person21() ;//报错:person21为抽象类,无法实例化

//        abstract关键字不可以与final同时使用
        Child21 c = new Child21();
        c.eat();
    }
}
//final abstract class Person21//逻辑同下
//abstract修饰后为抽象类必须通过子类重写才能使用,但是final不允许有子类,逻辑错误故不可以使用
abstract class Person21{
//    public void eat(){
//
//    }
    public abstract void eat();
//    public final abstract void eat();
    //abstract修饰后为抽象方法必须通过子类重写才能使用,但是final不允许有子类,逻辑错误故不可以使用
    public void test(){

    }
}
class Child21 extends Person21{
    public void eat(){
        System.out.println("孩子吃饭用手抓");
    }
}