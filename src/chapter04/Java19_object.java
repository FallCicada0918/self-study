package chapter04;
public class Java19_object {
    public static void main(String[] args) {

        //TODO 面向对象 - 单例模式
        // JVM默认给类提供的构造方法,其实就是公共的,无参构造方法
        // 1.类的创建过程复杂
        // 2.类的对象消耗资源
        //User19 user = new User19();
        User19 instance = User19.getInstance();
        User19 instance1 = User19.getInstance();
        User19 instance2 = User19.getInstance();
        User19 instance3 = User19.getInstance();
        User19 instance4 = User19.getInstance();
        User19 instance5 = User19.getInstance();
        User19 instance6 = User19.getInstance();

        System.out.println(instance == instance2);
        System.out.println(instance.equals(instance6));//.equals()判断括弧中的成员地址与.前的是否相等
    }

}
class User19{

    private static User19 user19 = null;//静态方法无法访问成员属性所以需要加上static否则下方无法使用
    private User19(){

    }
    public static User19 getInstance()//获取当前类型的对象
    {
        if( user19 == null){
            user19 = new User19();
        }
        return user19;
    }
}