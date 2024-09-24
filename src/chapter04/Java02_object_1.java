package chapter04;

public class Java02_object_1 {
    public static void main(String[] args) {
        //TODO 面向对象
        // 狗 ： 2只 ，小黑 ，小白
        Dog dog0 = new Dog();
        dog0.color = "white";
        dog0.name = "小白";
        dog0.run();

        Dog dog1 = new Dog();
        dog1.color = "black";
        dog1.name = "小黑";
        dog1.run();
    }
}
class Dog{
    String color;
    String name;
    void run(){
        System.out.println(name+"跑开了");
    }
}