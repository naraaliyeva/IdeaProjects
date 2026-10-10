package exercise7;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class vecka3 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        for(int i=0; i<text.length(); i++)
            System.out.print(text.charAt(i)+ " ");
    }

    }

