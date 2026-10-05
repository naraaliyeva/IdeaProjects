package Inlamningsuppgift;

import java.util.Scanner;

public class Main {

    private static Controller controller = new Controller();

    static void main(String[] args) {
        startUserDialog();
    }

    static void startUserDialog() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        controller.executeCommand(userInput);
        startUserDialog();
    }
}
