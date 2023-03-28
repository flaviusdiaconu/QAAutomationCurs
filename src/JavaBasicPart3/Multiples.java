package JavaBasicPart3;

public class Multiples {
    public static void main(String[] args) {
   Multiples obj=new Multiples();
   obj.display();
    }
    public void display(){
        for(int i=10; i<=50; i++){
            if(i%3==0){
                System.out.println("numar divizibil cu 3 :"  +i);

            }
        }
    }
}
