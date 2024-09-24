package chapter04;

public class Java14_object {
    public static void main(String[] args) {

        //TODO 面向对象
        //一个类中不能声明相同方法,也不能声明相同属性,同时也不能声明相同属性
        //这里相同方法指的是方法名,参数列表相同,与返回值类型无关
        //如果方法名相同,但是参数列表(个数,顺序,类型)不相同,会被认为时不同的方法,只不过名称不同
        //这个操作在Java中称之为方法的重载
        //构造方法也存在方法的重载

        User14 user = new User14();
        user.login(11111);
        user.login("123123123");
        user.login("zhangsan","1231232123");


        User14 user2 = new User14("zhangsan");
        user2.login(11111);
        user2.login("123123123");
        user2.login("zhangsan","1231232123");


    }
}
class User14{

    User14(){
        System.out.println("user.....");
    }

    User14(String name){
        System.out.println("user....." + name);
    }

    void login( String account, String password){
        System.out.println("账号.密码登录");
    }

    void login(int tel){
        System.out.println("手机验证码登录");
    }

    void login( String WechatiD){
        System.out.println("微信.支付宝登录");

    }
}
