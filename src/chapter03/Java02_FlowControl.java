package chapter03;

public class Java02_FlowControl {
    public static void main(String[] args) {
        //TODO 流程控制 - 分支執行
        // 分支結構
        //1、 TODO 可選分支 ： 單分支結構
        System.out.println("frist");
        System.out.println("second");
        //判斷：條件表達式的結果是否為true，如果為true，那麽執行分支邏輯如果為false，那麽繼續執行
        //判斷的語法使用if關鍵字，表示如果，在表達式前使用，如果結果為true，那麽分支邏輯應該在大括號中執行
//        int i = 20;
//        if (i == 10) {
//            System.out.println("分支");
//        }
//        System.out.println("third");

        // 2. TODO 必选分支：双分支结构（二选一）
        // 语法上使用if...else 操作，这里的else 就表示其他场合
//        int i = 20;
//        if (i == 10) {
//            System.out.println("分支");
//        }
//        else{
//            System.out.println("分支2");
//        }

        //3.TODO 多分枝
        int i = 20;
        if (i == 10) {
            System.out.println("分支");
        }
        else if(i == 20){
            System.out.println("分支2");
        }else{
            System.out.println("分支3");
        }

        System.out.println("third");
    }
}
