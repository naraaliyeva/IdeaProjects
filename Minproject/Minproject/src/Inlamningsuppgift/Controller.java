package Inlamningsuppgift;

import java.util.*;

public class Controller {
//lista som innehåller string attribut
    public List<String> sentences;

    public Controller() {  //Konstruktor
         sentences = new ArrayList<>();
    }
// vi la userInput in i sentences
    public boolean executeCommand(String userInput) {
        if (userInput.equals("stop")) {
            printStatistic();
            return false;
        }
        sentences.add(userInput);
        return true;
    }
//räknar tecken
    public int getCharsCount() {
        int charsCount = 0;
        for(var i=0; i < sentences.size(); i++) {
            if(!sentences.get(i).isBlank()) {
                charsCount += sentences.get(i).trim().length();
            }
        }
        return charsCount;
    }


//hur lång listan är med strengar/rader
    public int getRowsCount() {
        return sentences.size();
    }
    //räknar ord
    public List<String> getWords() {
        List<String> result = new ArrayList<>(); // skapar en tom lista där res samlas
        for(int i=0; i < sentences.size(); i++) {
            //Tar ut en lista på ord från en rad - där blanksteg separerar ord
            String[] rowWords = sentences.get(i).trim().split(" ");
            for(int ii=0; ii < rowWords.length; ii++) {
                if(!rowWords[ii].isBlank()) {
                    result.add(rowWords[ii]);
                }
            }
        }
        return result;
    }

    public String getLongestWord() {
        //Tar alla ord du har skrivit, ett ord på varje rad i listan
        List<String> allWords = getWords();
        String longestWord = "";
        for(int i=0; i < allWords.size(); i++) {
            if(allWords.get(i).length() > longestWord.length()) {
                longestWord = allWords.get(i);
            }
        }
        return longestWord;
    }

    void printStatistic() {

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
