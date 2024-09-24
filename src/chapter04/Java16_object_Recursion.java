package chapter04;

public class Java16_object_Recursion {
    public static void main(String[] args) {

        //TODO 面向对象 - 递归
        // 递归:方法调用自身,称之为递归方法
        //1 + 2 + 3 + 4 + 5 + .... + 14 + 15 + 16 + 17 + 18 + 19
//       int result = computeAP(20);
//        System.out.println(result);


        //阶乘： 5! => (4,3,2,1) => 5 * 4 * 3 * 2 * 1
        //      0的阶乘为1
        //一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        int result = computeFactorial( 5 );
        System.out.println(result);

        //1,递归方法应该有跳出的逻辑   => StackOverflowError  => 不断压栈中产生的错误
        //2,调用自身是,传递的参数需要(必要条件)有规律
    }
    public static int computeFactorial( int num ){
        if( num <= 1 ){
            return 1;
        }else{
            return num=computeFactorial( num - 1 );
        }
    }
    public static int computeAP( int num ){
        num = num % 2 == 0 ? num - 1 : num;
        if (num == 1){
            return 1;
        }else {
            return num + computeAP(num - 2);
        }
    }
}


