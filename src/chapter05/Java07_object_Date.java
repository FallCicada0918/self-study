package chapter05;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java07_object_Date {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  Date ： 日历类

//        new Calender();//抽象类,不能直接实例化
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));//从0开始故返回结果为操作时月份 -1
        System.out.println(instance.get(Calendar.DATE));
//        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
//        System.out.println(instance.get(Calendar.DAY_OF_MONTH));


        instance.setTime(new Date());
        instance.add(Calendar.YEAR,-1);

    }
}
