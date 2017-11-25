package lesson5;

import java.util.Scanner;

public class lesson5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNumber;

        System.out.print("Enter day number: ");
        dayNumber = input.nextInt();

       /* if(dayNumber == 1){
            System.out.println("Day with number "+dayNumber+ " is Mon");
        }else  if(dayNumber == 2){
            System.out.println("Day with number "+dayNumber+ " is Thu");
        }else  if(dayNumber == 3){
            System.out.println("Day with number "+dayNumber+ " is Wed");
        }else if(dayNumber == 4){
            System.out.println("Day with number "+dayNumber+ " is Thur");
        }else if(dayNumber == 5){
            System.out.println("Day with number "+dayNumber+ " is Fri");
        }else if(dayNumber == 6){
            System.out.println("Day with number "+dayNumber+ " is Sat");
        }else if(dayNumber == 7){
            System.out.println("Day with number "+dayNumber+ " is Sun");
        }else {
            System.out.println("Wrong day number");
        }*/

        switch (dayNumber) {
            case 1:
                System.out.println("Day with number " + dayNumber + " is Mon");
                break;
            case 2:
                System.out.println("Day with number " + dayNumber + " is Thu");
                break;
            case 3:
                System.out.println("Day with number " + dayNumber + " is Wed");
                break;
            case 4:
                System.out.println("Day with number " + dayNumber + " is Thur");
                break;
            case 5:
                System.out.println("Day with number " + dayNumber + " is Fri");
                break;
            case 6:
                System.out.println("Day with number " + dayNumber + " is Sat");
                break;
            case 7:
                System.out.println("Day with number " + dayNumber + " is Sun");
                break;
            default:
                System.out.println("Wrong day number");
        }

    }
}
