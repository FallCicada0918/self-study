package chapter04;

public class Java02_object_2{
    public static void main(String[] args) {
        //TODO 面向对象
        Teacher t = new Teacher();
        t.name = "zhangsan";
        t.teach();

        Student s = new Student();
        s.name = "lisi";
        s.study();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name + "老师在讲课");
    }
}
class Student{
    String name;
    void study(){
        System.out.println("同学" + name + "在听课");
    }
}