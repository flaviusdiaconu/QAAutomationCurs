package JavaBasicPart3;

import java.sql.SQLOutput;

public class MediaAritmetica {

    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public void mediaAritmetica() {
        int mediaAritmetica = (a + b + c) / 3;
        if (mediaAritmetica > 5&& mediaAritmetica<10) {
            System.out.println("Media aritmetica este mai mare decat 5");
        } else if (mediaAritmetica > 10) {
            System.out.println("Media aritmetica este mai mare decat 10");
        } else if (mediaAritmetica < 3) {
            System.out.println("Valoarea media aritmetica /1.5= " + (mediaAritmetica / 1.5));
        } else {
            System.out.println("Valori in afara conditiilor");
        }
    }
}
