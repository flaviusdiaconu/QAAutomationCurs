package JavaBasicPart3;

import Utils.Utils;

public class CnpRuner {
    public static void main(String[] args) {
        String number = Utils.scanner().nextLine();
        Cnp object= new Cnp();
        object.verificareCnp(number);

    }
}
