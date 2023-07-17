package guia_practica_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio_2 {

    public Ejercicio_2(String word) {

        this.isPalindrome(word);

    }

    ;

    public void isPalindrome(String word) {
        char[] lettersArray = new char[word.length()];
        char[] reverseLettersArray = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            lettersArray[i] = word.charAt(i);
            reverseLettersArray[i] = word.charAt(word.length() - i - 1);

            System.out.println(lettersArray[i] + " " + reverseLettersArray[i]);
        }

        boolean isPalindrome = Arrays.equals(lettersArray,reverseLettersArray);

        if (isPalindrome) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }


    }

}
