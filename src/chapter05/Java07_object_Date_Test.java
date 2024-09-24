package chapter05;


import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.util.Calendar;
import java.util.Date;

public class Java07_object_Date_Test {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        //  打印当前日历

        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        Calendar firstDate = Calendar.getInstance();
        //把日历对象设定为当前月的第一天
        firstDate.set(Calendar.DAY_OF_MONTH,1);
        //获取当前月的最大日期
        int maxDay = firstDate.getMaximum(Calendar.DAY_OF_MONTH);
        for( int i = 0 ; i < maxDay ; i++ ){
            //当前日期是周几
            int weekX =firstDate.get(Calendar.DAY_OF_WEEK);
            //当前日期是几号
            int monthY =firstDate.get(Calendar.DAY_OF_MONTH);
            if(i == 0){
                if(weekX == Calendar.SUNDAY){
                    for (int j = 0 ; j < 6 ; j++){
                        System.out.print("\t");
                    }
                    System.out.println(monthY);
                }else{
                    for (int j = 0 ; j < weekX - 2 ; j++){
                        System.out.print("\t");
                    }
                    //周日是1，周一是2.。。。。周六是7
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            }else{

                //非周日场合
                if(weekX == Calendar.SUNDAY){
                    System.out.println(monthY);
                }else{
                    System.out.print(monthY + "\t");
                }
            }
            //打印日历后，应该加一天
            firstDate.add(Calendar.DATE,1);
        }

    }
}
