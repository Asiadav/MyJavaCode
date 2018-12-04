package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type First Name: ");
        String firstName = input.nextLine();
        String firstInit = firstName.substring(0,1);
        System.out.println("Type Last Name: ");
        String lastName = input.nextLine();
        System.out.println(firstInit+". "+"Diddy "+ lastName.toUpperCase()+" "+firstName+"izzle");
    }
}
