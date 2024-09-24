package chapter06;


public class Java04_Exception {
    public static void main(String[] args) {

        // TODO 异常
        // 2. 索引越界 : java.lang.ArrayIndexOutOfBoundsException
//        String[] names = new String[3];
//        names[0] = "张三";
//        names[1] = "李四";
//        names[2] = "王五";
//        if ( names.length == 4 ){
//            names[3] = "赵六";
//        }
//        for ( int i = 0; i < names.length; i++ ){
//            System.out.println(names[i]);
//        }
//
//        // 4. 字符串索引越界 : java.lang.StringIndexOutOfBoundsException
//        String s = "abc";
//        System.out.println(s.charAt(0));
////        System.out.println(s.charAt(3));
//        // 字符串截取越界 (括号内值大于长度才会报错): java.lang.StringIndexOutOfBoundsException
//        System.out.println(s.substring(3));
        // 5.格式化异常 ： java.lang.NumberFormatException
//        String s = "a123";
//        Integer i = (Integer) s;//错误，并非异常
//        Integer i = Integer.parseInt(s);
//        System.out.println(i);

        // 6.类型转换异常 ： java.lang.ClassCastException
        Object obj = new User5();
        if ( obj instanceof Emp5){
            Emp5 emp = (Emp5) obj;
        }





    }
}
