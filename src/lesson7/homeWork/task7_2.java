package lesson7.homeWork;
/*Знайти суму квадратних коренів всіх
 цілиx чисел від 1 до b (значення b вводиться з клавіатури; 1≤b≤25).
  */

import java.util.Scanner;

public class task7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double userNumber;
        double minNumber = 1;
        double maxNumber = 25;
        double sum = 0;


        do {
            System.out.println("\nEnter numbers from 1 to 25 ;");
            System.out.print("Enter User Number -");
            userNumber = input.nextDouble();

            if (userNumber < minNumber) {
                System.out.println("Your number is to small. Try again.");
            } else if (userNumber > maxNumber) {
                System.out.println("Your number is to large. Try again.");
            } else {
                while (minNumber<=userNumber) {
                    sum+= Math.sqrt(minNumber);
                    minNumber++;
                   // System.out.println("minNumber" + minNumber + "");
                }
                System.out.println("Total sum = " + sum);
                break;
            }
        } while (true);

    }


}
