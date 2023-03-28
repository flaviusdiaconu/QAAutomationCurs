package JavaBasicPart3;

import Utils.Utils;

public class SumOfNumber {
    public static void main(String[] args) {
       SumOfNumber object=new SumOfNumber();
        System.out.println(object.number(Utils.scanner().nextInt()));
    }
    public String number(int number){
        int index1=(number/100)%10;
        int index3=number%10;
        int sum=index1;
        return String.valueOf(sum);
    }
}
