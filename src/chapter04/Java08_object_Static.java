package chapter04;

public class Java08_object_Static {
    public static void main(String[] args) {

        //TODO 面向对象 - 静态
        //针对于具体对象属性称之为对象属性,成员属性,实例属性
        //针对于具体对象方法称之为对象方法,成员方法,实例方法
        //TODO 把和对象无关,只和类相关的称之为静态.
        //和类相关的属性称之为静态属性
        //和类相关的方法称之为静态方法
        //静态语法就是在属性和方法前增加static关键字
        //Chinese c = null;->为错误不允许出现
//       Chinese c = new Chinese();
//       c.name = "Zhangsan";
//        System.out.println("Hello! " + c.name + "," +  c.nationality);
        Bird.fly();
        System.out.println(Bird.type);
    }
}
class Bird{
    static String type = "鸟";
    static void fly(){
        System.out.println("飛...");
    }
}
class Chinese{
    //姓名
    String name;

    //国籍
    String  nationality = "中國/China";
}