package chapter05;


public class Java01_object {
    public static void main(String[] args) {

        // TODO 常见类和对象
        //java.lang.object:对象
        Object obj = new Person();


        //将对象转换为字符串
        //@哈希code值(内存地址)
        //toString默认打印的就是内存地址值,所以,为了能够值观理解对象的内容,所以可以重写这个方法
        String s = obj.toString();
        System.out.println(s);


        // TODO 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        //TODO 判断两个对象是否相等,如果相等返回true,否则返回false
        // equals默认比较的是内存地址,所以,如果两个对象是同一个对象,那么返回true,否则返回false
        Person otherPerson = new Person();
        System.out.println(otherPerson.hashCode());
        System.out.println(obj.equals(new Person()));


        // TODO 获取对象的类型
        Class<?> aclass = obj.getClass();
        System.out.println(aclass.getSimpleName());
        System.out.println(aclass.getPackage().getName());

    }
}
class Person {
    String name = "张三";
    @Override
    public String toString() {
        return "person["+name+"]";
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class User extends Person {

}