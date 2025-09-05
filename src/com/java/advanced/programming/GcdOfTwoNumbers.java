package com.java.advanced.programming;

public class GcdOfTwoNumbers {

    public static void main(String[] args) {

        int n1=81;
        int n2 = 153;

        System.out.println("GCD is : " + findGcdOfTwoNumbers(n1,n2) );

    }

    public static int findGcdOfTwoNumbers(int n1, int n2) {

        // Handle both zeros
        if (n1 == 0 && n2 == 0) {
            throw new IllegalArgumentException("GCD is undefined for both numbers being zero.");
        }

        // If one number is zero, return the other
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        // for the Valid inputs find the gcd
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}


// we also use of this :

// Euclidean algorithm (more efficient than brute force)
//        while(n2 !=0){
//int temp = n2;
//n2 =n1 %n2;
//n1 =temp;
//        }
//
//                return n1;
//    }