package Javabasicpart2;
import Utils.Utils;

import java.util.Scanner;

public class Differencebetweensquare {
    public static void main(String[] args) {
        ReverseString reversed=new ReverseString();
        System.out.println(reversed.reverse(Utils.scanner().next()));
    }
    public int squareOfSum(int n){
        //calculam patratele primelor  n numere naturale
        int sum=0;
        for(int i=1; i<=10; i++){
            sum=sum+i;
        }
        return (int) Math.pow(sum,2);
    }
    public int sumOfSquare(int n){
        //
        int sum=0;
        for (int i=1; i<=n; i++){
            sum=(int) (sum+Math.pow(i,2));

        }
        return sum;
    }
    public int Differencebetweensquare(int n){
        return squareOfSum(n)-sumOfSquare(n)- sumOfSquare(n);
    }

    public static class exercises {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("introduceti un numar de la tastatura");
            double value=scanner.nextDouble();

            System.out.println(fahrenheitCelsius(value));
            reverse(3, 2);
            reverse(3, 2);


        }
        public static double fahrenheitCelsius(double fahr){
            return (fahr-32) * 5/9;
        }

        public static void reverse(double a, double b){
            a=a+b;   // a=13+8=21
            b=a-b;   // b=21-8=13
            a=a-b;   // a=21-13=8
            System.out.println("a= "+a+"--" +"b=  "+b);

        }

        public static void reverse1(double a, double b){

            double temp=a;
            a=b;
            b=temp;
            System.out.println("a= "+a+"--" +"b=  "+b);
        }
    }
}
