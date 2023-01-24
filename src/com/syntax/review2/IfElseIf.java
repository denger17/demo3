package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        int num=30;
        if (num>25) {
            System.out.println("if you completed more than 25");
        }else if (num>20) {
            System.out.println("good job");
        }else if (num>10){
            System.out.println("ok job");
            }

        System.out.println("-------------------------");
        String browser = "safari";

        if(browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        }else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefof browser");
        }else if (browser.equals("firefox")) {
            System.out.println("Test firefix");
        }else {// when none of the conditions are true,code comes to else
            System.out.println("Browser is not suported");
        }
        }

        /* when we have more conditions to test

        if (boolean condition) {code A;
        }else if (boolean condition) {
        code b;
        }else if (boolean condition) {
        Code C;
        }

         */
        /* Check Homework

        if you completed more than 25 -> great job
        if you completed more than >25 -> great job
        if you completed more than >10 -> great job
        if you completed more than > -> great job

         */
    }

