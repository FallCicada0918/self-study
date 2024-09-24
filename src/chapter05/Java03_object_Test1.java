package chapter05;


public class Java03_object_Test1 {
    public static void main(String[] args) {

        // TODO 常见类和对象
        //  数组
        int[] nums = {1,4,3,5,2};

//        for(int num : nums){
//            System.out.println(num);
//        }
        // TODO 希望获取到的数据 是 1,2,3,4,5
        for (int j = 0; j < nums.length; j++){
            // 简化需求：将数组中的最大值放置在数组最后
            for(int i = 0; i < nums.length - j - 1; i++){
                int num1 = nums[i];
                int num2 = nums[i+1];
                if(num1 > num2){
                    //左边数据大于右边数据，进行交换
                    nums[i] = num2;
                    nums[i+1] = num1;
                }
            }
        }

        for(int num : nums){
            System.out.println(num);
        }
    }
}
