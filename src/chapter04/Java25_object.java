package chapter04;

public class Java25_object {
    public static void main(String[] args) {

        //TODO 面向对象 bean规范
        // 1. 主要用于编写逻辑
        // 2. 建议解决问题时的数据模型(bean)
        // TODO bean设计规范：bean规范
        //  1. 类要求必须含无参，公共构造方法
        //  2. 属性私有化，提供公共的get/set方法
        //  3. 属性必须要有默认值
        //  4. 属性必须要有setter/getter方法
        //  5. 属性必须要有toString方法
        User25 user = new User25();
        user.setAccount("admin");
        user.setpassword("admin");
        System.out.println(login(user));


    }
    public static boolean login( User25 user ){
        if( user.getAccount().equals("admin") && user.getPassword().equals("admin")){
            return true;
        }else {
            return false;
        }
    }
}
class User25{
    private String account;
    private String password;

    public void setAccount(String account) {
        this.account = account;
    }
    public void setpassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }


}
