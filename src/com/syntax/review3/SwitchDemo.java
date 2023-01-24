package com.syntax.review3;

public class SwitchDemo {
    public static void main(String[] args) {

         int worldCup=2018;

         switch (worldCup){

             case 2022:
                 System.out.println("Winner is unknown");
                 break;
             case 2018:
                 System.out.println("Winner is France");
                 break;
             case 2016:
                 System.out.println("Winner is Germany");
                 break;
             default:
                 System.out.println("WInner");

         }
    }
}
