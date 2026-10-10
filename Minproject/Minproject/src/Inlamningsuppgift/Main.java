package Inlamningsuppgift;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        startUserDialog(new Scanner(System.in), new Controller());
    }

    static void startUserDialog(Scanner scanner, Controller controller) {
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.equals("stop")) {
                controller.printStats();
                break;
            }
            controller.executeCommand(userInput);
        }
    }
}
