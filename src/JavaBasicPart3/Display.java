package JavaBasicPart3;
//7) Java program to display the sum of n numbers using an array
public class Display {
    public static void main(String[] args) {
        int [] numbers={1,5,8,6,4,5};
        Display obj = new Display();
        System.out.println(obj.sum(numbers));



    }
     public int sum ( int[] array){
        int sum= 0;
        for (int i=0; i<array.length; i++){
            sum = sum+ array[i];

        }
        return sum;

     }

}
