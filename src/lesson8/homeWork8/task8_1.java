package lesson8.homeWork8;/*За допомогою циклу while напишіть програму
яка виведе на екран перші 10 парних чисел в
 діапазоні від А до B включно, а для всіх інших парних чисел буде знайдено іхню суму.
        A i B - вводиться користувачем з клавіатури, обов'язково перевіряти чи A < B.
        Якщо умова введення початкових даних не виконується, запустити повторне введення,
         до того моменту поки дані не будуть введені правильно.
        В результаті має бути виведена інформація про://
        3.1 Перші 10 парних чичел.//
        3.2 Суму всіх інших парних чисел.//
        3.3 Загальну кількість парних чисел в даному діапазоні.//
        3.4 Яке процентне відношення парних і непарних чисел в даному діапазоні`*/

import java.util.Scanner;

public class task8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FirstNumber, SecondNumber;
        int counter = 0;
        int sumPairedNumber = 0;
        int inputRangeDifferent = 22;
        int comonCounter = 0;


        do {
            System.out.println("Enter too different numbers ");
            System.out.print("Enter your first number - ");
            FirstNumber = input.nextInt();
            System.out.print("\nEnter your second number - ");
            SecondNumber = input.nextInt();

            if (SecondNumber > (FirstNumber + inputRangeDifferent)) {
                break;
            } else {
                System.out.println("You have entered wrong numbers.\nTry again.");
                System.out.println("Second  numbers must be bigger at 22 then first number \n");
            }
        } while (true);

        for (int i = FirstNumber; i <= SecondNumber; i++) {
            if (counter < 10) {
                if (i % 2 == 0) {
                    System.out.print(i + ";");
                    counter++;
                }
            } else {
                if (i % 2 == 0) {
                    sumPairedNumber = sumPairedNumber + i;
                    counter++;
                }
            }
            comonCounter++;
        }
        double porcentPaired = (counter*100/comonCounter);
        double procentOdd = 100-porcentPaired;


        System.out.println("Sum paired numbers = " + sumPairedNumber);
        System.out.println("Quantity of numbers = " + comonCounter);
        System.out.println("Quantity of paired numbers = " + counter);
        System.out.println("Percent paired = " + porcentPaired);
        System.out.println("Percent odd = " + procentOdd);


    }
}














