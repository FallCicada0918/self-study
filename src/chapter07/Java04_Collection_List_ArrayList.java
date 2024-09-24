package chapter07;

import java.util.ArrayList;

public class Java04_Collection_List_ArrayList {
    public static void main(String[] args) {

        //TODO 集合 - Collection - List
        // ArrayList的常用方法
        ArrayList list = new ArrayList();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhangsan");
        list.add("zhangsan");

        //TODO 插入
        // add可以传递两个参数第一个参数表示数据增加的位置，第二个表示位置
        list.add(1,"zhaoliu");

        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list.addAll(list1);

//        System.out.println(list.size());
        //TODO 判断
        // isEmpty方法判断集合是否为空
//        System.out.println(list.isEmpty());

        //TODO 删除指定集合中所有的
//        list.removeAll(list1);
//        System.out.println(list);
//        System.out.println(list.size());

        //TODO 清空
//        list.clear();
//        System.out.println(list.isEmpty());

        //TODO 包含
        // contains方法判断集合中是否包含指定的数据
//        System.out.println(list.contains("zhangsan"));

        //TODO 获取索引
        // indexOf方法获取指定数据在索引中的第一个位置，如果没有找到，返回-1
        System.out.println(list.indexOf("zhangsan"));
        // 只能获取第一个和最后一个
        System.out.println(list.lastIndexOf("zhangsan"));


        //TODO 集合变数组
//        Object[] arr = list.toArray();
//        for (Object o : arr) {
//            System.out.println(o);
//        }
        //TODO 克隆
        Object clone = list.clone();
        ArrayList list2 = (ArrayList) clone;
        System.out.println(list2);


        System.out.println(list);

    }
}
