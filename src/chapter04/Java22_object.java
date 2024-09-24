package chapter04;

public class Java22_object {
        public static void main(String[] args) {

            //TODO 面向对象 - 接口
            // 所谓接口,可以简单理解为规则.
            // 基本语法：interface接口名称{ 规则属性,规则行为 }
            // 接口其实是抽象的.
            // 规则的属性必须是固定值,而且不能修改.
            // 实行和行为的访问权限必须为公共的.
            // 属性应该是静态的.
            // 行为应该是抽象的.
            // 接口和类是两个层面的概念.
            // 类的接口需要循环接口,在Java中,这个循环,称之为实现.类需要实现接口,而且可以实现多个接口
            // 创建一个Computer对象
            Computer computer = new Computer();

            // 创建一个Litte_Light对象light0
            Litte_Light light0 = new Litte_Light();

            // 将light0赋值给computer对象的usb1属性
            computer.usb1 = light0;

            // 创建一个Litte_Light对象light1
            Litte_Light light1 = new Litte_Light();

            // 将light1赋值给computer对象的usb2属性
            computer.usb2 = light1;

            // 调用computer对象的powerSupply方法
            computer.powerSupply();
        }


}
interface USBInterface{

}
interface USBSupply extends USBInterface{
    public void powerSupply();
}
interface USBReceive extends USBInterface{
    public void powerReceive();
}
class Computer implements USBSupply{

    public USBReceive usb1;
    public USBReceive usb2;

    public void powerSupply(){
        System.out.println("电脑提供能源");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}
class Litte_Light implements USBReceive{
    public void powerReceive(){
        System.out.println("电灯收能源");
    }
}