package chapter06;


public class Java02_Exception {
    public static void main(String[] args) {

        // TODO 异常
        /*

        异常处理语法

        TODO try : 尝试
        TODO catch : 捕获
                    捕捉多个异常的时候，需要先捕捉范围小的异常，然后再捕捉范围大的异常
        TODO finally :  最终  无论是否出现异常，都会执行
        try{
            可能会出现异常的代码
            如果出现异常，那么JVM会将一场进行封装，形成一个异常类，然后这个异常抛出
            所有异常对象都可以抛出
        } catch ( 抛出的一场对象 对象引用 ) {
            异常的解决方案
        } catch () {

        } finally {
            最终执行的代码逻辑
        }
         */
        int i = 0 ;
        int j = 0 ;
        try {
            i = 10 ;
            j = 10 / i;
        } catch (Exception e){
            e.getMessage() ; //错误的消息
            e.getCause();
            e.printStackTrace();
            System.out.println("除数不能为0");
        } finally {
            System.out.println("最终执行的代码");
        }
        System.out.println(j);
    }

}