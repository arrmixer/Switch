package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int value = 1;
        if(value ==1){
            System.out.println("Value was 1");
        }else if (value = 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 6;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("was a 3, 4, or a 5");
                System.out.println("Actually the switch value was " + switchValue + ".");
                break;
            default:
                System.out.println("Value was not 1 through 5");
                break;
        }

        char character = 'F';

        switch(character){
            case 'A':
                System.out.println("The character was " + character + ".");
                break;
            case 'B':
                System.out.println("The character was " + character + ".");
                break;
            case 'C':
                System.out.println("The character was " + character + ".");
                break;
            case 'D':
                System.out.println("The character was " + character + ".");
                break;
            case 'E':
                System.out.println("The character was " + character + ".");
                break;
            default:
                System.out.println("The characters were not A, B, C, D, or E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("It's January");
                break;
            case "may":
                System.out.println("It's my birthday month!");
                break;
            case "february":
                System.out.println("It's my baby's birthday month!");
                break;
            default:
                System.out.println("It's some other month");
                break;
        }


    }
}
