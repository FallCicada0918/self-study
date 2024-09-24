package chapter05;


public class Java03_object {
    public static void main(String[] args) {

        // TODO 常见类和对象
        //  二维数组
//        Object[] nums = new Object[3];
//        //nums[0] = 1;
//        for(Object num : nums){
//            System.out.println(num);
//        }
//        String[] names = {"zhangsan" , "lisi" , "wangwu"};
//        //
//        System.out.println(names);
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println(names.length);
        
//        String[][] names = {{"zhangsan","lisi","wangwu"},{"zhaoliu","zhangqi","wangqi"},{"shabi"}};
        
        //TODO 标准二维数组
        String[][] names = new String[3][3];
        
        names[0][1] = "zhangsan";

        System.out.println(names[0][1]);

        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                System.out.print(names[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
