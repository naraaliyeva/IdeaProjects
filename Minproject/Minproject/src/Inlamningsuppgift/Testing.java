package Inlamningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class Testing {

    //När man kallar på controller.getWords() ska orden som skrivits
    //returneras i en lista sorterad i rätt ordning
    @Test
    void getWordsReturnsWordsFromAllSentencesInOrder() {
        Controller controller = new Controller();
        //Användaren har skrivit 2 meningar (tryckt enter 2 ggr)
        controller.executeCommand("Hej världen");
        controller.executeCommand("Java är kul");

        var expectedResult = List.of("Hej", "världen", "Java", "är", "kul");
        //Vi förväntar oss att orden är separerade enl. listan när man kallar på getWords()..
        Assertions.assertEquals(expectedResult, controller.getWords());
    }

    //Testar att vi får ut rätt antal rader och rätt "antal tecken"-uträkning
    @Test
    void testRowsAndCharsCount() {
        Scanner scanner = new Scanner("Hej världen\nJava är kul\nstop");
        Controller controller = new Controller();

        Main.startUserDialog(scanner, controller);
        Assertions.assertEquals(2, controller.getRowsCount());
        Assertions.assertEquals(22, controller.getCharsCount());
    }

    //Testar att variabeln doContinue sätts till False i Main om användaren
    //skriver ordet 'stop'
    @Test
    void sendExitSignalWhenStopCommandIsSent() {
        Scanner scanner = new Scanner("Hej världen\nJava är kul\nstop");
        Controller controller = new Controller();
        Main.startUserDialog(scanner, controller);
        Assertions.assertFalse(Main.isDoContinue());
    }
}
