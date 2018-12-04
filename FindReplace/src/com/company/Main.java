package com.company;

public class Main {

    public static String replaceOne(String text, int i, int n, String sub){
        String firstPart = text.substring(0,i);
        String secondPart = text.substring(i + n);
        return firstPart + sub + secondPart;
    }

    public static void main(String[] args) {
	    System.out.println(replaceOne("0123456789", 5, 3, "ayy lmao"));
        System.out.println(replaceOne("The quick brown fox...", 16, 3, "forklift"));

    }
}
