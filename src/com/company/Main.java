package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        System.out.println("Hi! Welcome to the TOWERS OF HANOI. How many disks would you like to see the solution of?");
        int numOfDisks = kbReader.nextInt();

        System.out.println("Here are the steps needed to complete the TOWERS OF HANOI with "+ numOfDisks + " disks.");
        TowersOfHanoi.steps(numOfDisks, "A", "B", "C");
        System.out.println("It will take " + TowersOfHanoi.numOfSteps + " steps to complete.");
    }
}
