package chapter01;

public class sum {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: java FactorialSum <n>");
                return;
            }

            try {
                int n = Integer.parseInt(args[0]);
                if (n <= 0) {
                    System.out.println("Please enter a positive integer.");
                    return;
                }

                long sum = 0;
                long factorial = 1;

                for (int i = 1; i <= n; i++) {
                    factorial *= i; // 计算当前数的阶乘
                    sum += factorial; // 将当前阶乘累加到总和中
                }

                System.out.println("The sum of factorials from 1 to " + n + " is: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

}
