package chapter03;

import chapter04.Java17_object_Access;

public class Java04_03 {
    public static void main(String[] args) {

        Java17_object_Access user = new Java17_object_Access();
        System.out.println(user.username);
//        System.out.println(user.name);     //私有属性不可在其类范围外使用
//        System.out.println(user.sex);      //默认属性不可再其包范围外使用


    }
}
