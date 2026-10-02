package Uppgifter3;

import java.util.Scanner;

public class SpellingGame {

    int score;
    String[] correctWords = new String[]{"katt", "hund", "hus"};
    int tries = 0;
    int gameNo = 0;
    int maxTries = 3;
    Scanner scanner = new Scanner(System.in);

    public int getScore() {
        return score;
    }

    public boolean checkWord(String userAnswer, String correctWord) {
        if (userAnswer.equals(correctWord)) {
            score += 1;
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        if (gameNo >= correctWords.length) {
            System.out.println("Spelet är över, bra kämpat!! Du uppnåde " + getScore() + " poäng.");
            return true;
        }
        return false;
    }

    public void runGame() {
        System.out.println("-------------------------------------");
        System.out.println("<3 Välkommen till Nar's ordspel ^^ <3");
        System.out.println("-------------------------------------");
        while (true) {
            if (tries >= maxTries) {
                gameNo++;
                if(isGameOver()) {
                    break;
                }
                tries = 0;
                System.out.println("Du har nu fått tre försök för ord " + (gameNo + 1) + ". Tyvärr lyckades du inte gissa rätt");
                System.out.println("Du får nu gissa på nästa ord.");
                System.out.println("----");
            }
            tries++;
            System.out.println("Gissa ett ord:");
            String userInput = scanner.nextLine();
            if (checkWord(userInput, correctWords[gameNo])) {
                System.out.println("GRATTIS !!! Du gissade ett rätt ord. Du har nu " + getScore() + " poäng.");
                tries = 0;
                gameNo++;
                if(isGameOver()) {
                    break;
                }
            }
        }
    }
}
