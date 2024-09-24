package chapter04;

public class Java23_object_Enum {
    public static void main(String[] args) {

        //TODO 面向对象 - 枚举
        // 枚举是一个特殊的类，其中包含了一组特定的对象(常量)，这些对象不会发生改变.
        // 用作常量使用,故一般使用大写标识符.
        // 枚举使用enum关键词使用.
        // 枚举类会将对象放置在最前,那么和后面的语法用分号(";")隔开.
        // 枚举类不能创建对象,它的对象是在内部自行创建
        System.out.println(City.BEIJING.code);
        System.out.println(City.SHANGHAI.name);
        System.out.println(MyCity.BEIJING.code);
        System.out.println(MyCity.SHANGHAI.name);
    }
}
class MyCity{
    public String name;
    public int code;
    private MyCity(String name,int code){//public => private
        this.code = code;
        this.name = name;
    }
    public static final MyCity BEIJING = new MyCity("北京",1001);
    public static final MyCity SHANGHAI = new MyCity("上海",1002);

}
enum City{
    BEIJING("北京",1001),SHANGHAI("上海",1002);
    //等同于创建对象,只不过没有用new的方式
    //在之前为无参,但是在下行方法引入后需要参数引入,故报错
    City( String name, int code){
        this.code = code;
        this.name = name;
    }
    public String name;
    public int code;
}

