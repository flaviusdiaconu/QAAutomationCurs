package JavaBasicPart3;

public class RunerAbstract {
    public static void main(String[] args) {
        Exemple object = new Exemple();
        object.sejoaca();
        object.mananca();
        object.scoateSunet();
        object.doarme();

        object.zboara();
        System.out.println(object.newValue("255: "));
        object.nume();
        System.out.println("Varsta este: " + object.varsta(5));
    }
}
