package chapter02;

public class Java_Datatype_2
{
    public static void main(String[] args) {
        // TODO 數據类型的转换

        String name = "zhangsan";
        int age = 30;

        name = "lisi";
        //name = age;

        //byte -> short -> int -> long -> float -> double
        byte  b = 10;
        short s = b;
        int i = s;
        long lon =  i;
        float f = lon;
        double d = f;
        //Java中范围小的数据可以转换为范围大的数据，反之无法直接转换
        //如果想要将大范围的数据转换为范围小的数据，那么需要小括号进行间接强制转换
        int i1 = (int)d;
    }
}
