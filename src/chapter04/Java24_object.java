package chapter04;

public class Java24_object {
    public static void main(String[] args) {
        // TODO 面向对象 -匿名类
        //  某些场合下：类的名字没有那么重要，我们只想使用这个类中的某些方法或功能，那么此时我们可以采用特殊的语法：匿名类
        //  匿名类：没有名字的类
        Me me = new Me();
//        me.sayHello(new Zhangsan());
        me.sayHello( new Person24() {
            public String name() {
                return "王五";
            }
        });
        me.sayHello( new Person24() {
            public String name() {
                return "赵六";
            }
        });
        new Bird24().fly();
        new fly(){
            public void fly() {
                System.out.println("使用飞行器飞");
            }
        }.fly();
    }
}
interface fly {
    public void fly();
}
class Bird24 implements fly {
    public void fly() {
        System.out.println("使用翅膀飞");
    }
}
abstract class Person24 {
    public abstract String name();
}
class Me {
    public void sayHello(Person24 person) {
        System.out.println("Hello, " + person.name());
    }
}
//class Zhangsan extends Person24 {
//    public String name() {
//        return "张三";
//    }
//}
//class Lisi extends Person24 {
//    public String name() {
//        return "李四";
//    }
//}
