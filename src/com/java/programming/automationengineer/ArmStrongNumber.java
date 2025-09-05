package com.java.programming.automationengineer;

public class ArmStrongNumber {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        sc.close();
//        1 = 1*1*1 , 5 = 5*5*5 , 3= 3*3*3 , sum them all then we should get the same number

        int number = 153;
        findArmStrongNumber(number);
    }

    private static void findArmStrongNumber(int number) {
        int originalNumber = number;
        int digit = 0;
        int sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println("Given number is armstrong number");
        } else {
            System.out.println("Given number is not an armstrong number");
        }
    }
}
