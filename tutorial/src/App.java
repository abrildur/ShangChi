/*
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 
Test Cases:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

import java.util.Scanner;

*/


public class App {
    
    public int lenghtofWords(String s){
            if( s == null) {
                return 0;
            }
            String[] words = s.split(" ");
            int len = 0;

            for (int i = words.length - 1; i >= 0; i--){
                len = words [i].length();
                if (len > 0 ) {
                    break;
                }
            }
            return len;
        }
    public static void main(String[] args) throws Exception {
        String input = "luffy is still joyboy";
        App holi = new App();
        System.out.println("The lenght of the last world is: " + holi.lenghtofWords(input));
    }
}
