package chapter04;

public class Java14_object_2 {
    public static void main(String[] args) {

        //TODO 面向对象
        byte b = 10;
        //test(b);,bbb
         //int => 32
         //byte => 8
         //short => 16
         //char => 16
        //基本数据类型在匹配方法时,可以在数值不变的情况下,扩大数据精度
        //byte 无法与char类型转换,char没有负数,而byte存在负数
    }
    static void  test( byte b ){
        System.out.println("bbb");
    }
    static void  test( short s){
        System.out.println("sss");
    }
    static void  test( char c){
        System.out.println("ccc");
    }
    static void  test( int i ){
        System.out.println("iii");
    }
}


