package chapter04;
import java.util.*;//引入java.util.内所有类
//import java.util.ArrayList;//用一句引入一句
//import java.util.Date;//导入引用:java(包名).util(包名).Date(类)
//                      //必须输入在package语句后不可输入在程序尾部


public class Java10_object_Import {
    public static void main(String[] args) {

        //TODO 面向对象 - import(导入)
        //import 主要用于使用类前准备好类
        //import语句式只能使用在package后,class前
        //import可以多次声明,导入多个类
        //如果同一个包内需要导入大量的类那么可以使用通配符"*"来简化操作
        //如果import了不同包中相同名称的类,那么还是需要在使用前添加包名
        //chapter04.Java10_object_Import 当前类的全类名
        java.lang.String name ="zhangsan";
        String name1 = "lisi";//String用法等同于上式由于使用频繁故java.lang中的文件可以省略包名

        Date d = new Date();
        new ArrayList();

        new chapter04.Java10_object_Import();
        new Java10_object_Import();
    }
}
