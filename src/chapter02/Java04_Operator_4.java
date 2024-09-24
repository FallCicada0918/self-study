package chapter02;

public class Java04_Operator_4
{
    public static void main(String[] args) {
        //TODO 運算子 ——三元運算子
        //所謂三元運算符就是三個元素參與運算的運算符
        //基本語法結構：
        //變量 = （條件表達式）？ （任意表達式1）：（任意表達式2）
        //運算規律：判斷條件表達式的結果，如果為true，那麽執行任意表達式1的值，如果或結果為false，那麽執行表達式2的值

        int i = 15;
        int j = 20;

        int k = ( i == 10 ) ? 1 + 1 : 2 + 2;
        System.out.println(k);
    }
}
