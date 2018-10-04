package com.company;

public class Main {

    public static void rep(){
        System.out.println("I don’t know why it wouldn’t compile,\nMy TA just smiled.\n");
    }

    public static void heart(){
        System.out.println("I added System.out.println(\" <3 coding\"),");
    }

    public static void backslash(){
        System.out.println("I added a backslash to escape the quotes,");
    }

    public static void verse1(){
        System.out.println("I once wrote a program that wouldn’t compile");
        rep();
    }

    public static void verse2(){
        System.out.println("My program did nothing\nSo I started typing.");
        heart();
        rep();
    }

    public static void verse3(){
        System.out.println("\"Parse error,\" cried the compiler\nLuckily I'm such a code baller.");
        backslash();
        heart();
        rep();
    }

    public static void verse4(){
        System.out.println("Java complained it expected an enum\nBoy, these computers really are dumb!");
        System.out.println("I added a public class and called it Scum,");
        System.out.println("I added a main method with its String[] args,");
        backslash();
        heart();
        rep();
    }

    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
    }
}
