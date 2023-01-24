package homeWork;

import java.util.Scanner;

public class Scannerhome34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        if ((number1<number2)&&(number2<number3)){
            System.out.println("The largest number is" +" "+number3);

        }
        if ((number1<number2)&&(number2>number3)){
            System.out.println("The largest number is " +""+number2);
        }
        if ((number3<number2)&&(number1>number2)){
            System.out.println("The largest number is" +" " +number1);
        }
    }
}
