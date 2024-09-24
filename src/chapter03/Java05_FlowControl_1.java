package chapter03;

public class Java05_FlowControl_1 {
    public static void main(String[] args) {
        //TODO 流程控制 - 分支執行 - 重复执行/循环执行
//        for(int i = 0; i < 10 ; i ++){
//            if( i == 4){
//
//            }else {
//                System.out.println(i);
//            }
//        }
        //break关键字直接会跳出循环，不再执行循环后的后续操作
        //continue直接会跳过当前循环，直接执行下一次循环
        for(int i = 0; i < 10 ; i ++){
            if( i == 4){
                //切断，跳出循环
                //break;
                 continue;
            }
                System.out.println(i);

        }
    }
}
