package chapter07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Java05_Collection_List_LinkedList {
    public static void main(String[] args) {

        //TODO 集合 - Collection - List
        //LinkedList：Linked(链表) + List
        //构建集合对象
        LinkedList list = new LinkedList();

        //TODO 增加第一个数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
//        list.addFirst("lisi");
//        list.addLast("wangwu");
//        list.add(1,"zhaoliu");

        //TODO 获取第一个数据
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        //TODO 获取数据
//        System.out.println(list.get(1));
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//
//        }

        //增强for循环
//        for (Object obj : list) {
//            System.out.println(obj);
//        }

        //TODO 修改数据
        list.set(1,"zhaoliu");

        //TODO 删除数据
        //按照位置删除，或者删除数据
        list.remove(1);
        //按照数据元素删除数据
        list.remove("zhaoliu");

        //TODO 打印集合数据
        System.out.println(list);


    }
}
