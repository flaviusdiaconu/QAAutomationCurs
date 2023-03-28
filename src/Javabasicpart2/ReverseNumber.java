package Javabasicpart2;

import Utils.Utils;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber=new ReverseNumber();
        System.out.println(reverseNumber.reverse(Utils.scanner().nextInt()));
        System.out.println(reverseNumber.reverse2(Utils.scanner().nextInt()));

    }
    public int reverse(int number) {

        int val = 0;

        while (number > 0) {
            val = val * 10 + number % 10;
            number = number / 10;
        }

        return val;
    }

    public int reverse2(int number) {

        int r, sum = 0;
        while (number > 0) {
            r = number % 10;

            sum = sum * 10 + r;
            number = number / 10;

        }
        return sum;
    }
}
