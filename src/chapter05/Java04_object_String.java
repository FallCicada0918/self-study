package chapter05;


public class Java04_object_String {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        // TODO 字符串：连续字符组合形成的数据整体
        //  java.long.String
        //  字符串，字符，字节的关系
//        String name = "zhangsan";
//        String name1 = new String("zhangsan" );
//        char[] cs = {'a','中','国'};
//        byte[] data = {-28,-72,-83,-27,-101,-67};
//
//        String a = new String(cs);
//
//        String s1 = new String(data,"utf-8");
//        System.out.println(a);
//        System.out.println(s1);
        String s = "\"";
        // 转义字符：、“ => 文字内容双引号
        // \' => 文字内容单引号
        // \n => 换行
        // \t => 制表符
        // \\ => \
        System.out.println(s);
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("\\");
    }
}
