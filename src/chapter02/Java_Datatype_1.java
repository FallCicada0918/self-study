package chapter02;

public class Java_Datatype_1
{
    public static void main(String[] args) {
        String name = "zhangsan";
        // TODO 基本數據类型

        // TODO 1.整数类型
        //  byte : 8位
        //  short : 16位
        //  int : 32位
        //  long : 64位

        //TODO 2.浮点类型:含有小数点的数据类型
        // 根据计算精度分为
        // 默认情况下 : 小数点的数据会被识别为精度较高的双精度double类型
        // floot : 单精度浮点类型，数据需要使用F或f结尾
        float f = 1.0f;// 结尾字母f或F都可以
        // double : 双精度浮点类型
        double d = 2.0;

        //TODO 3.字符类型
        // 所谓字符类型 : 其实就是用符号来表示文字类型
        char c = '@';

        //TODO 4.布尔类型‘
        // true,false,标识判断条件是否成立，如果成立，取值true，反之，那么取值false
        boolean bln = true;
    }
}
