package com.Leslie;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // public class RollingDice{

        Scanner scan = new Scanner(System.in);
        Random randGen = new Random();

        int sides = 1;
        int die1;
        int die2;
        int roll;
        String toss = "throw";
        String answer = "yes";

     do {


        System.out.println("Welcome to the Grand Circus Casino! ");
        System.out.println("Please choose the number of sides for the pair of dice:  ");
        sides = scan.nextInt();
        scan.nextLine();

        System.out.println("Type 'throw' to roll the dice");
        toss = scan.findInLine("throw");
        scan.nextLine();


        die1 = (int) (Math.random() * sides) + 1;
        die2 = (int) (Math.random() * sides) + 1;
        roll = die1 + die2;
        System.out.println("The roll of the first dice is: " + die1);
        System.out.println("The roll of the second dice is: " + die2);
        System.out.println("Your total roll is: " + roll);

         System.out.println("If you would like to roll again type 'yes': ");


         answer = scan.nextLine();

    }
    while (answer.equals("yes"));












    }








                }


