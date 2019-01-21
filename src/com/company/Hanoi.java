package com.company;

public class Hanoi {

    public static void steps(int disks, String beginning, String middle, String last){

        if (disks == 1){
            System.out.println(beginning + " to "+ last);
        }

        else {
            steps(disks - 1, beginning, last, middle);
            System.out.println(beginning + " to " + last);
            steps(disks - 1, middle, beginning, last);
        }

    }

}
