package chapter05;


public class Java04_object_String_1 {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        // TODO 字符串操作

        // TODO 拼接：将多个字符串连接在一起
//        String s = "a"+"b";
//        String s1 = "ab";
//        String s2 = "abc" + 1 + 2;//abc12
//        String s3 = 1 + "abc" + 2;//1abc2
//        String s4 = ( 1 + 2 ) + "abc";//3abc
//
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//
//        System.out.println(s1.concat("abc"));
//        //TODO 字符串的比较
//        String a = "a";
//        String b = "b";
//        String c = "a";
//        String d = "A";
//
//        //相比
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
//        //忽略大小写相比较
//        System.out.println(a.equalsIgnoreCase(d));
//
//        // i = 正数， a>b
//        // i = 负数， a<b
//        // i = 0， a=b
//        byte b1 = (byte)'a';
//        byte b2 = (byte)'A';
//        System.out.println("a = " + b1);
//        System.out.println("A = " + b2);
//
//
//        int i = a.compareTo(d);
//        //返回Ascii码比较
//        System.out.println(i);
//        //忽略大小写进行比较
//        System.out.println(a.compareToIgnoreCase(d));
//        //TODO 字符串的阶段操作 ：截断字符串的操作
//        String s = "   hello world   ";
//        //子字符串
//        //substring方法用于截断操作，需要传递两个参数
//        //         第一个参数表示截取字符串的起始位置(索引 ， 包含)
//        //         第二个参数表示截断字符串的结束位置(索引 ， 不包含)
//        System.out.println(s.substring(0, "hello".length()));
//        System.out.println(s.substring(6,s.length()));
//        //substring方法用于截断操作，如果只传入一个参数
//        //         表示截取字符串从起始位置到字符串最后
//
//        // 分解字符串，根据下hiding的规则对字符串进拆分，可以将一个完整的字符串，分解成几个部分
//        String[] s1 = s.split(" ");
//        System.out.println(s1.length);
//        for (String s2 : s1){
//            System.out.println(s2);
//        }
//        String s2 = "hello,world,java";
//        String [] s3 = s2.split(",");
//        for (String s4 : s3) {
//            System.out.println(s4);
//        }
//        // TODO trim : 去掉字符串首尾空格的意思
//        System.out.println("!" + s.trim() + "!");
//
//        // TODO 字符串的替换
//        String s = "hello world";
//        //替换
//        System.out.println(s.replace("world", "java"));
//        String s1 = "hello world world";
//        System.out.println(s1.replace("world", "java"));
//        String s2 = "hello world zhangsan";
//        System.out.println(s2.replace("world zhangsan", "java"));
//        //replaceAll按照制定规则进行替换
//        System.out.println(s2.replaceAll("world|zhangsan", "java"));
//
//        // TODO 字符串大小写转换
//        String s = "hello world";
//        //全部字符转换为小写
//        System.out.println(s.toLowerCase());
//        //全部字符转换为大写
//        System.out.println(s.toUpperCase());
//
//        String className = "user";// u + ser;
//        String s1 = className.substring(0,1);//u
//        String s2 = className.substring(1);//ser
//
//        System.out.println(s1.toUpperCase()+s2);

        // TODO 字符的串查找
        String s = "hello world";
        char[] chars = s.toCharArray();
        byte [] bytes = s.getBytes("UTF-8");
        // charAt可以传递索引定位字符串中指定位置的字符
        System.out.println(s.charAt(1));
        //indexOf查找指定字符或字符串在字符串中第一次出现的位置
        System.out.println(s.indexOf("hello"));
        System.out.println(s.indexOf("world"));

        String s1 = "world hello world";
        System.out.println(s1.indexOf("world"));
        //lastIndexOf查找指定字符或字符串在字符串中最后一次出现的位置
        System.out.println(s1.lastIndexOf("world"));

        //contains 判断字符串中是否包含指定的字符串，返回boolean类型
        System.out.println(s.contains("hello"));

        //startsWith 判断字符串是否以指定的字符串开头，返回boolean类型
        System.out.println(s.startsWith("hello"));

        //endWith 判断字符串是否以指定的字符串结尾，返回boolean类型
        System.out.println(s.endsWith("word"));

        String s3 = "";
        //isEmpty 判断字符串是否为空，空格也算特殊字符,不算空返回boolean类型
        System.out.println(s.isEmpty());
        System.out.println(s3.isEmpty());
    }
}
