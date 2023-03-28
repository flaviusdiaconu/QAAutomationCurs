package Colection;

import Utils.Utils;

import java.util.concurrent.Callable;

//How to convert string to float
public class Convert {
    public static void main(String[] args) {
        System.out.println("introdu de la tastatura");
        Convert obj= new Convert();
        System.out.println(obj.convert(Utils.scanner().next()));

    }
    public float convert(String  value){
        float cifre = Float.parseFloat(value);
            return cifre;

    }

}
