package com.aurionpro.test;
import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String longestSequence = findLongestSequence(input);
        
        System.out.println("Longest sequence: " + longestSequence);
        System.out.println("Length: " + longestSequence.length());
    }
    
    public static String findLongestSequence(String str) {
        int maxLength = 0;
        int currentLength = 1;
        int endIndex = 0;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
                
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i;
                }
            } else {
                currentLength = 1;
            }
        }
        
        int startIndex = endIndex - maxLength + 1;
        return str.substring(startIndex, endIndex + 1);
    }
}
