package Javabasicpart2;

public class RaspberryPi {
    public static void main(String[] args) {

        RaspberryPi object =new RaspberryPi();
        System.out.println(object.convert(new String[]{"Orange", "Red" , "Yalow"}));
    }


    public int colors(String a){
        switch(a){
            case "Black":
                return 0;
            case "Brown":
                return 1;
            case "Red":
                return 2;
            case "Orange":
                return 3;
            case "Yellow":
                return 4;
            case "Green":
                return 5;
            case "Blue":
                return 6;
            case "Violet":
                return 7;
            case "Grey":
                return  8;
            case "White":
                return 9;
            default:
                return -1;
        }
    }
    public int convert(String[] colorsCode) {
        int number =0;
        for (int i=0; i< colorsCode. length; i++) {
            number = number * 10 + colors(colorsCode[i]);
        }
        return number;
    }
    }
