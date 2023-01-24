package homeWork;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;
// Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
//
//If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
//
//Based on the score define users eligibility:
//
//- if score is below  600 --> eligibility = "Not eligible"
//- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//- if score is higher than any other previous values --> eligibility = "Definitely eligible" .
////
//**Output:**
//
//```
//The eligibility is ____
public class home35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan= input.nextBoolean();
        System.out.println("What is your credit score?");
        String lean=input.nextLine();

        int eligibility=900;
        if (eligibility<600) {
            System.out.println("Not eligible");
            if (eligibility>600){
                System.out.println("Maybe eligible");
            } else if (eligibility<700) {
                if (eligibility>701){
                    System.out.println("Eligible");
                } else if (eligibility<800) {
                    if (eligibility>850);
                    System.out.println("Definitely eligible");
                    String el=input.nextLine();

                }

            }
    }



        }
    }


