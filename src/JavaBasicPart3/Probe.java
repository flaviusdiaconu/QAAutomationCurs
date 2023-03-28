package JavaBasicPart3;

public class Probe {
    public class Variables {

        public static void main(String[] args) {
            Variables var = new Variables();
            var.sum();
            System.out.println(var.x);
            System.out.println(var.y);
        }

        public  void sum() {
            int x = 10;
            int y = 15;
            System.out.println("suma: " + (10+15));
        }
    }
}
