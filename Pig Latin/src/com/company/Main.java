package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[] stringParseWithSplitMethod(String string){ //a pointless method
        //System.out.println(Arrays.toString(string.split(" ")));
        /*
        String[] punctuation = {",",".","";"",':','?' };
        String[] words = string.split(" ");

     for (String word : words) {
         for(char punc : punctuation) {


             if (word.substring(word.length() - 1) == punc) {

             }
         }
            }

        */
        return string.split(" ");
    }

    public static String[] stringParse(String string){  //improved string parser
        int totalSpaces = 0;
        for(int i = 0; i <= string.length()-1; i++){
            if(string.charAt(i) == ' '){
                totalSpaces += 1;
            }
        }
        //System.out.println(totalSpaces);
        int[] indexOfSpaces = new int[totalSpaces];
        String[] words = new String[totalSpaces+1];
        int indexCounter = 0;
        for(int index = 0; index <= string.length()-1; index++){
            if(string.charAt(index) == ' '){

                indexOfSpaces[indexCounter] = index;
                indexCounter += 1;
            }
        }
        //System.out.println(indexOfSpaces + " " + string.length());
        int startOfSubString = 0;

        for(int i = 0; i<= words.length-2; i++){
            //System.out.println(startOfSubString + " " + indexOfSpaces[i]);
            words[i] = string.substring(startOfSubString, indexOfSpaces[i]);
            startOfSubString = indexOfSpaces[i] + 1;
        }
        words[words.length-1] = string.substring(startOfSubString);

        return words;
    }

    public static String pigLatinConversionWithArrays(String[] words){ //converts array of words in to a string of the combined piglatin sentence
        String finishedTranslation = "";

        for (String word : words) {
            finishedTranslation += convert(word) + " ";
        }

        return finishedTranslation;
    }

    public static String pigLatin(String word){ //the worst string parser I could ever make
        int start;
        int spaceAt = 0;
        boolean run = true;
        String pigLatin = "";
        while(run) {    //loop for running through the string sequentially to parse the words
            start = spaceAt ;
            for (int i = start + 1; i <= word.length()-1; i++) {    //checks through each character of the string and breaks at a space
                if (word.charAt(i) == ' ') {
                    spaceAt = i+1;
                    break;
                }
                if (i == word.length()-1){
                    run = false;
                    break;
                }
            }
            if (!run){break;}
            pigLatin += convert(word.substring(start, spaceAt-1))+" ";  //runs parsed word through pigLatin converter and then adds it to the running total string
        }
        pigLatin += (convert(word.substring(spaceAt)));
        return pigLatin;
    }

    public static String convert(String word){   //converts a single word into its piglatin counterpart
        char[] checkVowel = {'a','e','i','o','u'};
        boolean found = false;
        int lastCons = 0;
        //System.out.println(word.length());
        if(word.length() == 0){
            return word;
        }else{

            for (int i = 0; i < word.length(); i++) {  //checks where the first vowel exists
                for (char vowel : checkVowel) {
                    if (word.charAt(i) == vowel) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    lastCons = i;
                    break;
                }
            }

            return word.substring(lastCons) + word.substring(0, lastCons) + "ay";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String startingText = input.nextLine();
        //System.out.println(pigLatin(startingText));                                                   //my original attempt
        //System.out.println(pigLatinConversionWithArrays(stringParse(startingText)));                  //my better revision
        System.out.println(pigLatinConversionWithArrays(stringParseWithSplitMethod(startingText)));     //this one feels like cheating
    }
}
