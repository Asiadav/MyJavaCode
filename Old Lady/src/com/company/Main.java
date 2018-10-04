package com.company;

public class Main {

    public static void rep1(){
        System.out.print("There was an old lady who swallowed a");
    }

    public static void rep2(){
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.\n");
    }

    public static void rep3(){
        System.out.println("She swallowed the spider to catch the fly,");
    }

    public static void rep4(){
        System.out.println("She swallowed the bird to catch the spider,");
    }

    public static void rep5(){
        System.out.println("She swallowed the cat to catch the bird,");
    }

    public static void verse1(){
        rep1();
        System.out.println(" fly.");
        rep2();
    }

    public static void verse2(){
        rep1();
        System.out.println(" spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        rep3();
        rep2();
    }

    public static void verse3(){
        rep1();
        System.out.println(" bird,");
        System.out.println("How absurd to swallow a bird.");
        rep4();
        rep3();
        rep2();
    }
    public static void Cattobird()  {
        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Imagine that to swallow a cat.");
        System.out.println("She swallowed the cat to catch the bird,");
    }
    public static void Dogtocat() {
        System.out.println("There was an old lady who swallowed a dog");
        System.out.println("What a hog to swallow a dog");
        System.out.println("She swallowed the dog to catch the cat,");
    }
    public static void Horsetodeath() {
        System.out.println("There was an old lady who swallowed a horse");
        System.out.println("She died, of course.");
    }
    public static void Versefiller() {
        System.out.println("She swallowed the bird to catch the spider,");
        System.out.println("She swallowed the spider to catch the fly,");
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
    }
/*
    public static void verse4(){
        rep1();
        System.out.println("cat,");
        System.out.println("Imagine that to swallow a cat.");
        rep5();
        rep4();
        rep3();
        rep2();
    }

    public static void verse5(){
        rep1();
        System.out.println("dog,");
        System.out.println("What a hog to swallow a dog.");
        System.out.println("She swallowed the dog to catch the cat,");
        rep5();
        rep4();
        rep3();
        rep2();
    }

    public static void verse6(){
        System.out.println("There was an old lady who swallowed a horse,\nShe died of course");
    }
    */
    public static void main(String[] args) {
	    verse1();
	    verse2();
	    verse3();
	    //verse4();
	    //verse5();
	    //verse6();
        Cattobird();
        Versefiller();
        System.out.println();
        Dogtocat();
        System.out.println("She swallowed the cat to catch the bird,");
        Versefiller();
        System.out.println();
        Horsetodeath();

    }
}





