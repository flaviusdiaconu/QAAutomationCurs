package Skillbrain;

public class Main {
    public static void main(String[] args) {
        primaMetoda();
        douaMetoda(6.2);
        System.out.println(treiMetoda(5));

    }
    //  tipul de acces > tipul returnat >nume metodei( parametri) {
    //   public               void         main
    //}

    static void primaMetoda() {
        System.out.println("Prima mea metoda");
    }

    static void douaMetoda(double dublu) {
        double rezultat = dublu *2;
        System.out.println(rezultat);

    }
    static int treiMetoda(int intreg){
        int rezultat =intreg*intreg;
        return rezultat;
    }

}