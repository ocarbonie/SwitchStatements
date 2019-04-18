package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days;
        boolean done = true;

        System.out.println("Enter the number of days and I will tell you which months "+
                "have these amount of days");

        while(done) {
            days = input.nextInt();

            switch (days) {
                case 28:
                    System.out.println("February on non leap years");
                    break;
                case 29:
                    System.out.println("February on leap years");
                    break;
                case 30:
                    System.out.println("September, April, June, November");
                    break;
                case 31:
                    System.out.println("January, March, May, July, August, October, " +
                            " December");
                    break;
                default:
                    System.out.println("No months have " + days);
                    break;

            }
            input.nextLine();

            System.out.println("\nAre you done (y/n)?");
            String answer = input.nextLine();

            if (answer.toLowerCase().equals("y")) {
                done = false;
            }
            else {
                done = true;
                System.out.println("\nEnter the number of days: ");
            }
        }
        System.out.println("Goodbye!!");
    }
}
