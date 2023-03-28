package Javabasicpart2;

import Utils.Utils;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(Utils.scanner().next()));

    }

    public String reverse(String string) {
        char[] elementChar = string.toCharArray();
        char[] reversedVal = new char[string.length()];
        int j = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedVal[j++] = elementChar[i];
        }
        return String.valueOf(reversedVal);
    }
}
