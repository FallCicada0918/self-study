package chapter04;

public class Java13_object {
    public static void main(String[] args) {

        //TODO 面向对象 - 多态
        // 所谓多态，其实就是一个对象在不同场景下表现出不同的状态和形态
        // 多态语法其实就是对对象使用场景进行了约束
        // 一个对象可以使用的功能取决于引用变量的类型

        Person p = new Person();  // 创建一个Person对象
        p.testPerson();  // 调用Person类的testPerson方法

        Person p1 = new Boy();  // 创建一个Boy对象，并使用Person类型的引用变量引用
        Boy b1 = (Boy) p1;  // 将p1强制转换为Boy类型，并赋值给b1
        b1.testBoy();  // 调用Boy类的testBoy方法

        Person p2 = new Girl();  // 创建一个Girl对象，并使用Person类型的引用变量引用
        Girl g1 = (Girl) p2;  // 将p2强制转换为Girl类型，并赋值给g1
        g1.testGirl();  // 调用Girl类的testGirl方法

        Boy b2 = new Boy();  // 创建一个Boy对象
        b2.testBoy();  // 调用Boy类的testBoy方法

        Girl g2 = new Girl();  // 创建一个Girl对象
        g2.testGirl();  // 调用Girl类的testGirl方法
    }
}

class Person {
    void testPerson() {
        System.out.println("test Person...");
    }
}

class Boy extends Person {
    // 重写了父类的testPerson方法
    @Override
    void testPerson() {
        System.out.println("test Boy (override Person)...");
    }

    void testBoy() {
        System.out.println("test Boy...");
    }
}

class Girl extends Person {

    void testGirl() {
        System.out.println("test Girl...");
    }
}