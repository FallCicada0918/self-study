package chapter05;


public class Java05_object_Datatype {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  基本数据类型
        //  byte short int long
        //  float double
        //  char
        //  boolean
        //TODO 包装类
//        Byte b = null;
//        Short s = null;
//        Integer i = null;
//        Long l = null;
//        Float f = null;
//        Double d = null;
//        Character c = null;
//        Boolean bln = null;
        int i = 10;
        //Integer ii = new Integer(i);//Java虚拟机不推荐使用
        //TODO 将基本数据类型转换为包装类型
//        Integer ii = Integer.valueOf(i);//等同于如下
        // 自动装箱
        Integer i1 = i;

//        int i2 = i1.intValue();
        // 自动拆箱
        int i2 = i1;

        //相应的类型转换
        i1.byteValue();
        i1.shortValue();
        i1.longValue();
        i1.floatValue();
        i1.doubleValue();
//        i1.charValue();
//        i1.booleanValue();
    }
}
