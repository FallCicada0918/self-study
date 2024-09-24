package chapter05;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Java06_object_Date {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  Date ： 时间类
        //时间戳：1970年1月1日0时0分0秒(时间原点)到当前时间的毫秒数
        System.out.println(System.currentTimeMillis());

        //Date ：日期类
        //Calendar：日期类

        Date d = new Date();
        System.out.println(d);

        //Java格式化日期格式 ：
        // yyyy-MM-dd HH:mm:ss
        // y (Y) -> 年 -> yyyy
        // M -> 月 -> mm
        // D (d) -> 日 -> dd
        // dd -> 一个月中的日期    D -> 一年中的日期
        // H (h) -> 时 -> HH
        // h -> 12进制    H -> 24进制
        // m -> 分钟 -> mm
        // s (S) -> 秒 -> ss
        // s -> 秒 -> sss   S -> 毫秒 -> SSS


        // Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateFormatString = sdf.format(d);
        System.out.println(dateFormatString);


        // String -> Date
        String dateString = "2024-07-12 09:29:12.123";
        Date parseDate =sdf.parse(dateString);
        System.out.println(parseDate);



        //根据时间戳构建指定的日期对象
//        d.setTime(System.currentTimeMillis());
        //获取时间戳
        d.getTime();


        //判断时间先后
        System.out.println(parseDate.before(d));
        System.out.println(parseDate.after(d));
    }
}
