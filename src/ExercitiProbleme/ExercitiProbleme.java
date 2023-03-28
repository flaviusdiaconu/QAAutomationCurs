package ExercitiProbleme;

import java.sql.SQLOutput;

public class ExercitiProbleme {
    public static void main(String[] args) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int a = 12, b = 12;
        int result1, result2;
        System.out.println("Value of a: " + a);
        result1 = ++a;
        System.out.println("After increment: " + result1);
        System.out.println("Value of b: " + b);
        result2 = --b;
        System.out.println("After decrement: " + result2);

        String greeting="Hello";
        System.out.println(greeting);

        String txt ="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        System.out.println("The length of the txt string is:" + txt.length());

        String txt1="Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());


    }
}
