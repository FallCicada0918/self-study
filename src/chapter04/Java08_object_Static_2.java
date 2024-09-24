package chapter04;

public class Java08_object_Static_2 {
    public static void main(String[] args) {

        //TODO 面向对象 - 静态
        // 类的信息加载完成后,会自动调用静态代码块
        // 可以完成静态属性的初始化功能
        // 对象准备创建时,也会自动调用代码块,但不是静态的
        User08.test();
        /*
        执行结果:
        静态代码块执行
        test
         */
        new User08();
        /*
        运行结果:
        静态代码块执行
        代码块执行
         */
    }
}
class User08{
    static//静态代码块
    {
        System.out.println("静态代码块执行");
    }
    static void test(){
        System.out.println("test...");
    }
    {//构建对象后方可执行例:new User08();
        System.out.println("代码块执行");
    }
}
