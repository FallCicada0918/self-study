package chapter05;


public class Java04_object_String_2 {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象

//
//        String s = "";
//        for ( int i = 0; i <= 100; i++){
//            s = s + i + ",";//0,1,2,3,4,5,6,..........,100
//        }
//        System.out.println(s);


        //"a" + "b" => "ab"
        StringBuilder s = new StringBuilder();
        for ( int i = 0; i <= 100; i++){
            s.append(i).append(",");//0,1,2,3,4,5,6,..........,100
        }
        System.out.println(s.toString());

        StringBuilder s1 = new StringBuilder();
        s1.append("abc");
        System.out.println(s1.toString());
        System.out.println(s1.length());
        //reverse反转字符串
        System.out.println(s1.reverse());
        //inset插入字符串于指定位置
        System.out.println(s1.insert(1, "123"));
        //
//        System.out.println(s1.capacity());
    }
}
