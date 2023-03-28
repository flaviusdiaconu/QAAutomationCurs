package Exercitii;

import Utils.Utils;

public class Triunghiuri {
    public static void main(String[] args) {
        Triunghiuri triunghiuri= new Triunghiuri();
        triunghiuri.determineTriangle(Utils.scanner().nextInt(),Utils.scanner().nextInt(), Utils.scanner().nextInt());
;
    }
    public void determineTriangle(int a, int b, int c){
        if( (a !=0) && (b !=0) && (c !=0)) {
            if( (a + b >= c) &&(a + c >= b) && (b + c >= a)) {
                if (a == b && a == c && b == c) {
                    System.out.println("Triangle is e equilateral");

                } else if (a == b || a == c || b == c) {
                    System.out.println( "Triangle is isoscel");

                } else if (!(a == b) && !(a == c) && !(b == c)) {
                    System.out.println("Triangle is scalene");

                }
            } else{
                System.out.println("Suma a doua laturi nu este mai mare sau egalaa");
            }
        }else{
            System.out.println("Adauga o valoare diferita de 0");
        }
    }
}

