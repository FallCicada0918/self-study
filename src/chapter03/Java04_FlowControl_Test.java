package chapter03;

public class Java04_FlowControl_Test {
    public static void main(String[] args) {
        //TODO 流程控制 - 分支執行 - 小练习
        int age = 30;
        //儿童（0~6），少年（7~17），青年（18~40），中年（41~65），老年（66~+inf）
        //if...else if...else if...else :多分支判断
        //switch...case...case...dafault:等值分支判断
        if (age < 7){
            System.out.println("儿童");
        }
        else if (age >= 7 && age <18){
            System.out.println("少年");
        }
        else if (age >= 18 && age < 40){
            System.out.println("青年");
        }
        else if (age >= 41 && age < 66){
            System.out.println("少年");
        }
        else{
            System.out.println("老年");
        }

    }
}
