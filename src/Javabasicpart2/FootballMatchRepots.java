package Javabasicpart2;
import Utils.Utils;

public class FootballMatchRepots {
    public static void main(String[] args) {
        FootballMatchRepots match = new FootballMatchRepots();
        System.out.print(match.players(Utils.scanner().nextInt()));

    }

    public String players(int nr) {
        switch (nr) {
            case 1:
                return "goalie";

            case 2:
                return "left back";

            case 3:
            case 4:
                return "center back";

            case 5:
                return "right back";

            case 6:
            case 7:
            case 8:
                return "midfielder";

            case 9:
                return "left wing";

            case 10:
                return "striker";

            case 11:
                return "right wing";

            default:
                return "Valoare in afara limitelor";

        }
    }
}


