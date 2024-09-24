package chapter04;

public class Java20_object {
    public static void main(String[] args) {

        //TODO 面向对象
        //Java中提供了一种语法，可以在数据初始化后不被修改使用关键词final
        //final可以修饰变量：变量的值一旦初始化无法修改
        //final可以修饰属性：那么JVM无法自动进行初始化，需要自己进行初始化，属性值不能发生变化
        //                故使用final修饰时必须自行对类中属性进行赋值
        //一般将final修饰的变量称之为常量,或者叫不可变变量
        //final可以修饰方法：这个方法不能被子类重写
        //final可以修饰类  ：这个类没有子类(丁克)
        //                 不可以有子类继承
        //final不可以修饰构造方法
        //final可以修饰方法参数：一旦修饰参数就无法修改
        final String name = "zhangsan";
        System.out.println(name);

        //User20 user = new User20("wangwu");
        User20 user = new User20();
        //user.name = "zhangsan";
//        System.out.println(user.name);


        //user.name = "lisi";
//        System.out.println(user.name);
    }
}
final class User20{
//    public final User20(){
//
//    }//报错:这里不允许使用修饰符final
    public User20(){

    }
     public String name ;
     public User20(String name){
         this.name = name;  //this.后表示当前属性,=后name表示当前参数
     }

     public final void test(final String name ){
//         name = "lisi"//报错无法赋值给final变量name
     }
}
//class Child20 extends User20{
//    public final void test(){
//
//    }
//}//报错,可以继承不可以修改内部逻辑

