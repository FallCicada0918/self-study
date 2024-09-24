package chapter04;

public class Java07_object_Method_Param {
    public static void main(String[] args) {

        //TODO 面向对象 - 方法 - 参数
        //使用外部数据控制内部实现操作,使用的是参数语法的实现,也叫方法参数
        //语法:方法名( 参数类型 参数名称 )
        //语法:方法名( 参数类型1 参数名称1, 参数类型2 参数名称2 )

        User07 user = new User07();
        String name = "zhangsan";
        int age = 30;
        //传递参数
        //user.sayHello( name , age);

        //当方法传递多个参数时间, 需要注意
        //1,参数个数需要匹配
        //2,参数类型需要匹配
        //3,参数顺序需要匹配

        //4,当参数个数不确定,但是,类型相同时,可以采用特殊参数与发声明,可变参数
        //  如果参数中还包含其他可变参数,那么可变参数应该声明在最后
        //语法:参数类型...参数名称
        user.test();
        user.test("zhangsan");
        user.test("zhangsan","lisi");
        user.test("zhangsan","lisi","wangwu");
    }
}
class User07{

    void sayHello( String name, int age ){
        //使用参数
        System.out.println("hello " + name + "," + age);
    }

    void test(String... name){
        System.out.println(name);
    }
}
