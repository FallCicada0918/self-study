package chapter05;


import java.text.SimpleDateFormat;
import java.util.*;

public class Java08_object_Util {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  工具类
        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty(" "));
        System.out.println(StringUtil.isEmpty("abc"));

        System.out.println(StringUtil.getRandomString());
        System.out.println(StringUtil.getRandomString("abcdefg1232456", 6));

//        System.out.println(StringUtil.transform("你好", "UTF-8", "ISO8859-1"));
//        System.out.println(StringUtil.transform("你好", "ISO8859-1", "UTF-8"));
        System.out.println(StringUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(StringUtil.parseDate("2020-07-12", "yyyy-MM-dd"));
    }
}
//字符串工具类
//  1.工具类不应该创建对象才能使用,也就意味着,可以直接使用类中的属性和方法,所以一般都是静态的
//  2.工具类对外提供的属性或方法都应该是公共的
//  3.为了使用者开发方便,应该尽量提供丰富的方法和属性
class StringUtil {
    //判断非空
    public static boolean isEmpty(String str) {
        //如果字符串为null,为空
//        if (str == null) {
//            return true;
//        }
        //如果字符串为空字符串,为空
//        if ("".equals(str)) {
//            return true;
//        }
        //如果字符串全都是空格,也为空
//        if("".equals(str.trim())){
//            return true;
//        }
        if(str == null || "".equals(str.trim())){
            return true;
        }
        return false;
    }
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
    //生成随机字符串
    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }
    public static String getRandomString(String from, int len) {
        if( len < 1 ) {
            return "";
        }else{
            char[] chars = from.toCharArray();
            StringBuilder str = new StringBuilder();

            for ( int i = 0; i < len; i++ ) {
                Random random = new Random();
                int j =random.nextInt(chars.length);
                char c = chars[j];
                str.append(c);
            }
            return str.toString();
        }
    }
    //转换字符串 : ISO8859-1 => str => UTF-8
    public static String transform( String source , String encodeFrom, String encodeTo ) throws Exception{
        byte[] bytes = source.getBytes(encodeFrom);
        return new String(bytes,encodeTo);
    }

    public static Date parseDate(String dateString,String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateString);
    }

    public static String formatDate( Date date,String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}