package Colection;

import Utils.Utils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StrTolong {
    public static void main(String[] args) {
        System.out.println("introduceti o valoare");
        StrTolong obj=new StrTolong();
        System.out.println(obj.longlist(Utils.scanner().next()));

    }
    public long convert(String value){
        long number =Long.parseLong(value);
        return number;
    }
    public Long longlist(String value){
        ArrayList al =new ArrayList();
        al.add(convert(value));
        return(Long) al.get(0);
    }
}
