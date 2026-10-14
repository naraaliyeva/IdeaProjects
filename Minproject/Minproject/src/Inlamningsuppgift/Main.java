package Inlamningsuppgift;

import java.util.Scanner;

public class Main {

    private static boolean doContinue;

    static void main(String[] args) {
        startUserDialog(new Scanner(System.in), new Controller());
    }
// skapa testbarhet genom att ha inparametrar
    static void startUserDialog(Scanner scanner, Controller controller) {

        //Kommer köra förevigt tills någon skriver "stop"
        while (scanner.hasNextLine()) {
            //Körs när användaren trycker Enter - läser in orden
            String userInput = scanner.nextLine();
            //Skicka det användaren skrivit till logikklassen - och kolla om vi ska fortsätta
            doContinue = controller.executeCommand(userInput);
            if(!doContinue) {
                break;
            }
        }
    }

    static boolean isDoContinue() {
        return doContinue;
    }
}
