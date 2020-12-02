package com.noah.demo;

public class Mysqrt {


    public int mySqrt(int x) {

        int left = 0;
        int right = x;

        int result = 0;

        while (left <= right) {

            int temp = (left + right) / 2;
            if (temp * temp > x) {
                right = temp - 1;
            } else {
                left = temp + 1;
            }
            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(new Mysqrt().mySqrt(9));

    }

}
