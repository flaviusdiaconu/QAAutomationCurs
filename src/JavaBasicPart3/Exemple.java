package JavaBasicPart3;

import java.sql.SQLOutput;

public class Exemple extends CaineAbstract implements AnimalInterface{

    @Override
    public void mananca() {
        System.out.println(" Caine");
    }

    @Override
    public void sejoaca() {
        System.out.println("Alearga");
    }



    @Override
    public void scoateSunet() {
        System.out.println("Ham HAM");
    }

    @Override
    public void doarme() {
        System.out.println("Zzzz");
    }

    @Override
    public void zboara() {
        System.out.println("Pasare");
    }

    @Override
    public String newValue(String value) {
        return value + "Asta este valoarea concatenata";
    }
}
