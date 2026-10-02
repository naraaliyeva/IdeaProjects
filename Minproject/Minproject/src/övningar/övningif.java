package övningar;

public class övningif {
    static void main(String[] args) {

        int number1 = 8;
        int number2 = 6;

        if (number1 > number2) {
            System.out.println("Första talet är störst");
        } else {
            System.out.println("Andra talet är störst");
        }
        if (number1 < number2) {
            System.out.println("Andra talet är störst");

        }
        if (number1 % number2 == 0) {
            System.out.println("delbart");
        }
        else  {
            System.out.println("inte delbart");
        }

    }
}
