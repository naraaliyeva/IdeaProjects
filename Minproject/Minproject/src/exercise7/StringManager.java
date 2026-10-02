package exercise7;

import jdk.swing.interop.SwingInterOpUtils;

public class StringManager {

    static void main(String[] args) {


        String myString = "some text";
        if(myString.equals("some text")) {

            System.out.println("Yes the next is the same");
        }

        if(myString.length()==9){
            System.out.println("The text is exactly 9 carakters!!!");
        }

        System.out.println(myString.charAt(myString.length()-7));
    }
}
