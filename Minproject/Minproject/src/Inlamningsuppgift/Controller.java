package Inlamningsuppgift;

import java.util.*;

public class Controller {

    private List<String> sentences = new ArrayList<>();

    public void executeCommand(String userInput) {
        if(userInput.equals("stop")) {
            printStats();
            System.exit(0);
        }
        sentences.add(userInput);
    }

    private void printStats() {
        List<String> allWords = new ArrayList<>();

        //Antal tecken
        int charsCount = 0;
        for(var i=0; i < sentences.size(); i++) {
            charsCount += sentences.get(i).length();
        }

        //Antal rader + spara alla ord i en gemensam lista (allWords)
        final var rowsCount = sentences.size();
        int wordsCount = 0;
        for(var i=0; i < sentences.size(); i++) {
            wordsCount += sentences.get(i).split(" ").length;
            allWords.addAll(Arrays.stream(sentences.get(i).split(" ")).toList());
        }

        //Längsta ordet
        var longestWord = "";
        for(var i=0; i < allWords.size(); i++) {
            if(allWords.get(i).length() > longestWord.length()) {
                longestWord = allWords.get(i);
            }
        }

        System.out.println("Antalet rader: " + rowsCount);
        System.out.println("Antalet tecken: " + charsCount);
        System.out.println("Antalet ord: " + wordsCount);
        System.out.println("Längsta order är: " + longestWord);

    }
}
