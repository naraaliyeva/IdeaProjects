package Inlamningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class Testing {

    @Test
    void getWordsReturnsWordsFromAllSentencesInOrder() {
        Controller controller = new Controller();
        controller.executeCommand("Hej världen");
        controller.executeCommand("Java är kul");

        Assertions.assertEquals(
                List.of("Hej", "världen", "Java", "är", "kul"),
                controller.getWords());
    }

    @Test
    void startUserDialogProcessesSentencesAndStopsOnStopCommand() {
        Scanner scanner = new Scanner("Hej världen\nJava är kul\nstop\nignored\n");
        RecordingController controller = new RecordingController();

        Main.startUserDialog(scanner, controller);

        Assertions.assertEquals(2, controller.getRowsCount());
        Assertions.assertEquals(22, controller.getCharsCount());
        Assertions.assertTrue(controller.statsPrinted);
        Assertions.assertEquals("ignored", scanner.nextLine());
    }

    @Test
    void startUserDialogProcessesSentencesUntilInputEnds() {
        Scanner scanner = new Scanner("Hej världen");
        RecordingController controller = new RecordingController();

        Main.startUserDialog(scanner, controller);

        Assertions.assertEquals(1, controller.getRowsCount());
        Assertions.assertFalse(controller.statsPrinted);
        Assertions.assertFalse(scanner.hasNextLine());
    }

    @Test
    void mainStartsDialogAndExitsWhenInputEnds() {
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(new byte[0]));
            Main.main(new String[0]);
        } finally {
            System.setIn(originalIn);
        }
    }

    private static class RecordingController extends Controller {
        private boolean statsPrinted;

        @Override
        void printStats() {
            statsPrinted = true;
        }
    }
}
