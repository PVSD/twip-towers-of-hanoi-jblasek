package com.company;


public class TowersOfHanoi {
public static int numOfSteps = 0;
    public static void steps(int disks, String beginning, String middle, String last){

        if (disks == 1){
            numOfSteps++;
            System.out.println(numOfSteps + ": "+ beginning + " to "+ last);
        }

        else {
            steps(disks - 1, beginning, last, middle);
            numOfSteps++;
            System.out.println(numOfSteps + ": "+ beginning + " to " + last);
            steps(disks - 1, middle, beginning, last);
        }

    }









}
