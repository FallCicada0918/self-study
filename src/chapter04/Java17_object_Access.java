package chapter04;

public class Java17_object_Access {

    private String name;
    public String username;
    String sex;

    public static void main(String[] args) {



        //TODO 面向对象 - 访问权限
        //public : 公共的 , 访问权限修饰符
        //         Java源码中,公共类只能有一个,而且必须和源码文件名相同
        //main方法 : main由Java是由JVM调用的,JVM调用时应该可以任意调用,而不用考虑权限问题.
        //static:静态方法确立

        //TODO Java中的访问权限主要分为四种:
        // 1,private : 私有的 , 同一类中可以使用,可暂时理解为局部变量与全局变量的区别
        // 2,(default) : 默认权限 , 当不设定任何权限时 , JVM会默认提供权限 , 称之为包(路径)权限
        // 3,protected : 受保护的权限,子类可以访问
        // 4,public : 公共的 , 任意使用
        // 访问权限范围由 1 -> 4 逐步增大

        User17 user = new User17();
//        System.out.println(user.name);
        System.out.println(user.username);
        System.out.println(user.age);
    }

}
 class User17{
    private String name;
    public String username;
    String sex;
    protected int age;
    void test(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(username);
    }
 }
class child17 extends User17{
    void test(){
        System.out.println(age);
    }
}
