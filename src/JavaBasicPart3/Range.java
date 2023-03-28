package JavaBasicPart3;

public class Range {
    public static void main(String[] args) {
        Range obj= new Range();
        obj.sum();
    }
    public void sum(){
      for (int i=100; i <= 150; i++){
          int  sum=0;
          int num=i;
          while(num!=0){
              sum+=num%10;
              num/=10;
          }
          if(sum %2==0){
              System.out.println("nummaru par este : " + i);
          }
      }
    }
}
