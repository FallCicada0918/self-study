package chapter05;


public class Java03_object_Test {
    public static void main(String[] args) {

        // TODO 常见类和对象
        //  二维数组

        /*
            星星塔
             *
           * * *
          * * * *

         */
        // 1 => 1
        // 2 => 3
        // 3 => 5
        // 4 => 7

        // 1 => 0
        // 2 => 1
        // 3 => 2
        // 4 => 3

        // 1 =>       8
        // 2 =>     7;8;9
        // 3 =>   6;7;8;9;10
        // 4 => 5;6;7;8;9;10;11
        int row = 9;
        int col = 2 * (row - 1) + 1;
        String[][] nineTower = new String[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (j >= (row - 1) - i && j <= (row - 1) + i){
                    nineTower[i][j] = "*";
                }else {
                    nineTower[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(nineTower[i][j]);
            }
            System.out.println();
        }
    }
}
