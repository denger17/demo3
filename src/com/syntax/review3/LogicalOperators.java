package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean dashboard=false;
        String message="Welcome admin";
        if (dashboard|| message.equals("Welcome admin")) {
            System.out.println("User is succesefully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        boolean b=false;
        System.out.println(!true);// false

        boolean agreeCheckboxSelected=false;

        if (!agreeCheckboxSelected){

            System.out.println("I am clicking on checkbox");

            boolean boo=!false;
            System.out.println(boo);
        }




    }
}
