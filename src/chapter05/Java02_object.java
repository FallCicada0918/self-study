package chapter05;


public class Java02_object {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组
        User1 user1 = new User1();
        User1 user2 = new User1();
        User1 user3 = new User1();
        User1 user4 = new User1();


        user1.test();
        user2.test();
        user3.test();
        user4.test();

        //索引范围：0 ~ 3
        User1[] users = new User1[4];
        for( int i = 0; i < users.length; i++){
            users[i] = new User1();
        }
        for (int i = 0; i < users.length; i++){
            users[i].test();
        }


        //TODO 数组的声明方式：类型[] 数组名;
        //TODO 数组的创建：类型[] 数组名 = new 类型[长度/容量];
        String[] names =  new String[3];
        //给数组添加数据，添加的方式为：数组名[索引] = 数据;
        //添加数据和访问数据时，索引是不能超过指定的范围的(0 ~ length - 1)
        //重复给相同的索引添加数据，等同于修改数据
        names[0] = "张三";
        names[0] = "赵六";
        names[1] = "李四";
        names[2] = "王五";

        //查询(访问)数据，访问的方式为：数组名[索引]
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
        System.out.println("***************************************************");
        for( int i = 0; i < names.length; i++){
            System.out.println("names["+i+"] "+ ":" + names[i]);
        }
    }
}
class User1 {
    public void test() {
        System.out.println("test......");
    }
}