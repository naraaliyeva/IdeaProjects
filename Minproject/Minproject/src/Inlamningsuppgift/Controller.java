package Inlamningsuppgift;

import java.util.*;

public class Controller {

    private List<String> sentences;

    public Controller() {  //Konstruktor
         sentences = new ArrayList<>();
    }

    public void executeCommand(String userInput) {
        sentences.add(userInput);
    }

    public int getCharsCount() {
        int charsCount = 0;
        for(var i=0; i < sentences.size(); i++) {
            charsCount += sentences.get(i).length();
        }
        return charsCount;
    }

    public int getRowsCount() {
        return sentences.size();
    }

    public List<String> getWords() {
        List<String> words = new ArrayList<>();
        for(int i=0; i < sentences.size(); i++) {
            words.addAll(Arrays.stream(sentences.get(i).split(" ")).toList());
        }
        return words;
    }

    public String getLongestWord() {
        var allWords = getWords();
        var longestWord = "";
        for(var i=0; i < allWords.size(); i++) {
            if(allWords.get(i).length() > longestWord.length()) {
                longestWord = allWords.get(i);
            }
        }
        return longestWord;
    }

    void printStats() {

        int rowsCount = getRowsCount();
        int charsCount = getCharsCount();
        int wordsCount = getWords().size();
        String longestWord = getLongestWord();

        System.out.println("Antalet rader: " + rowsCount);
        System.out.println("Antalet tecken: " + charsCount);
        System.out.println("Antalet ord: " + wordsCount);
        System.out.println("Längsta order är: " + longestWord);
    }
}
