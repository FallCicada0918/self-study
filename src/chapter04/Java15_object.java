package chapter04;

public class Java15_object {
    public static void main(String[] args) {

        //TODO 面向对象 - 方法的重写
        //方法的重写: 父类对象的方法其实主要体现通用性,无法在特殊的场合下使用
        //          如果在子类对像需要在特殊场合下使用,那么就需要重写方法的逻辑,这个操作在Java中称之为方法的重写
        //这里的重写,并不会意味着父类的方法被覆盖掉,只是当前场合不适用,如果使用super关键字还是可以访问
        //方法的重写要求,子类方法和父类方法,方法名相同,返回值类型相同,参数列表相同
        Child15 child = new Child15();
        child.test();
    }
}
class Parent15{
    String name = "zhangsan";

    void test(){
        System.out.println("parent test...");
    }
}
class Child15 extends Parent15{
    String name = "lisi";

    void test(){
//        System.out.println(this.name);
//        System.out.println(super.name);
        super.test();
        System.out.println("child test...");
    }
}
