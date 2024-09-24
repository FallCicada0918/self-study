package chapter05;


public class Java03_object_Test3 {
    public static void main(String[] args) {

        // TODO 常见类和对象
        //  数组 - 数据查询

        int [] nums = {1,2,3,4,5,6,7};
        //二分法查找

        //查询目标
        int targetNum = 5;
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] > targetNum) {
                end = middle - 1;
            } else if (nums[middle] < targetNum) {
                start = middle + 1;
            } else {
                break;
            }
        }
        System.out.println("数据在数组中的位置"+ middle);
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 6) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

    }
}
