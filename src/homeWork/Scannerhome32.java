package homeWork;

import java.util.Scanner;

public class Scannerhome32 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your gender: M or F");
            char gender=input.next().charAt(0);
            System.out.println("Please enter your age");
            int age=input.nextInt();
            if(gender=='M')
                if(age>25){
                    System.out.println("Man");
                }
                else if (age<25){
                    System.out.println("Boy");
                }
            if (gender=='F')
                if(age>25)
                    System.out.println("Woman");
                else if (age<25){
                    System.out.println("Girl");





                }
        }
    }


