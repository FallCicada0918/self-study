package chapter07;

import java.util.ArrayList;

public class Java03_Collection_List {
    public static void main(String[] args) {

        //TODO 集合 - Collection - List
        // ArrayList : Array + List
        //TODO List : 列表，清单
        //      按照数据插入顺序进行存储
        //TODO Array : 数组，阵列


        //TODO 创建第一个集合对象：ArrayList
        ArrayList list = new ArrayList(3);
        // 1、不需要传递构造参数，直接new就行，底层数组为空数组
        // 2、构造参数传递一个int类型的值，用于设定底层数组的长度
        // 3、构造参数传递一个Collection集合类型数据，用于把其他集合中的数据全部添加到当前集合中

        //TODO 增加数据
        // add方法可以增加数据，只要将数据作为参数传递到add方法中即可
        // 添加数据时，如果集合中没有任何数据，那么底层会创建默认长度为10的数组空间
        list.add("zhangsan");
        list.add("zhangsan");
        list.add("wangwu");
        list.add("zhaoliu");//自动在底层扩容，创造更大的空间，来存放新的数据

        //TODO 访问集合中的数据
        // 获取集合中数据的条数
        System.out.println(list.size());

        //TODO 获取指定位置的数据，可以采用索引的方式
        System.out.println(list.get(1));
        //遍历集合中的数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中的第"+ (i + 1) + "个数据为：" + list.get(i));
        }

        //TODO 如果不关心顺序，可以采用特殊的(增强)for循环的方式来遍历集合中的数据
        //for(循环对象 : 集合){}
        for (Object obj : list) {
            System.out.println("集合中的数据：" + obj);
        }

        //TODO 修改集合中的数据
        // 将指定位置的数据进行修改，set方法需要传递两个值，第一个参数：表示数据的位置，第二个参数：修改的值
        // set方法返回值：修改之前的数据
        Object oldVar = list.set(1, "lisi");
        System.out.println("修改之前的数据为：" + oldVar);

        //TODO 删除数据
        // remove方法可以删除指定位置的数据，也可以删除指定数据
        // remove方法返回值：删除的数据
        Object remove = list.remove(1);
        System.out.println("删除的数据为：" + remove);


        //TODO 打印集合对象
        System.out.println(list);


        
    }
}
