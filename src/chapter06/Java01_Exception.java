package chapter06;


public class Java01_Exception {
    public static void main(String[] args) {

        // TODO 错误

        // 1. 错误：类型转换错误
        //语法错误
        String s = "123";
//        Integer i = (Integer) s;
        Integer i2 = Integer.parseInt(s);

        //2.递归没有跳出错误 ： StackOverflowError
        //尽量避免
        //栈溢出
        //Error 错误
//        test();

        //3.访问一个为空对象的成员方法时，出现了错误 ： java。long。NullPointerException(异常)
        //  Java中一场分为两大类
        //  1. 可以通过代码恢复正常逻辑执行的异常，称之为运行期异常 ： RuntimeException
        //  2. 不可以通过代码恢复正常逻辑执行的异常，称之为编译器异常  ： Exception
        User user = new User();
        System.out.println(user.toString());
    }
    public static void test() {
        test();
    }
}
class User{

}