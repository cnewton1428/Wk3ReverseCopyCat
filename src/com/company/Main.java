package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Multiples of 5 and 7
        Scanner kbd = new Scanner(System.in);

        String response = "";


        do {
            System.out.println("Enter a number");
            int num = kbd.nextInt();
            //execute statements 1st inside do; while checks if conditions are true/false then checks the statements
            //while only checks condition before it loops and it can result in false results in the beginning

            for (int i = num; i >= 1; --i) { //bigger value >1; start at 30 (30 is >1; and decrement) (29 is never <= 1 and loop does not execute); positive values only
                if (i % 7 == 0 || i % 5 == 0) {
                    System.out.println(i); //print out number stored in i which is the current value of w.e. the iteration is and kbd is what we get from a user; what we start at(kbd is the starting value and can't be changed for each iteration of the loop)
                    //so index holds the value of w.e. pt is in the loop
                    //1st iteration is 30; next is 29 and loops until it gets to 1;
                }
            }
            System.out.println("Would you like to enter another number (y/n)");
            response = kbd.next();

        } while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")); //as long as the user does not enter y it will terminate the loop/ game stops. If they enter y they can enter another number
//while checks different condition
        System.out.println("Thank you for playing!");
    }
}