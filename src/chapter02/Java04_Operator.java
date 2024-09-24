package chapter02;

public class Java04_Operator
{
     public static void main(String[] args) {
        // TODO 运算符
        //所谓运算符就是参与数据运算的符号，Java定义的无法自行定义

        //TODO 表达式
        //所谓的表达式就是采用运算符和数据连接在一起形成符合Java语法规则指令，称之为表达式

        //TODO 算术运算符
        //1.二元运算符 : 两个元素参与运算的运算符， 1+2
         int a = 1;
         int b = 2;
         a = a ^ b;
         b = a ^ b;
         a = a ^ b;
         System.out.println("a = " + a);
         System.out.println("b = " + b);
        //TODO 算术表达式 = 元素1 二元运算符 元素2
        //这个表达式是有结果的，就需要又类型，这里的类型是元素中最大的类型的那一种
        //最小类型为int
//        System.out.println(1 + 2);//3
//        System.out.println(2 - 2);//0
//        System.out.println(3 * 2);//6
//        System.out.println(1 / 2);//0.5 （int，int）==》 int
//        System.out.println(1 / 2);//0.5 （double，int）==》 double
//        System.out.println(5 % 2);//1（取余：模运算）

//        byte b1 = 10;
//        byte b2 = 20;
//        byte b3 = (byte)(b1 + b2);
        //TODO 2.一元运算符，一个元素参与运算的运算符
        // ++，--
        int i = 0;
//        int j = i;//j = 0;
//        i = i + 1;//i = 1
         int j = i++;
//        System.out.println("i = "+ i);
//        System.out.println("j = "+ j);
    }
}
