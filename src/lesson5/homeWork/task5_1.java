package lesson5.homeWork;

import java.util.Scanner;

/*
Знайти суму всіх цілих чисел від а до 200 (значення а вводиться з клавіатури;
a≤200).
 */
public class task5_1 {
    public static void main(String[] args) {
        int sum = 0;
        int maxElement = 200;

        System.out.println("Enter same  number from 1 to 200");
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        System.out.println("Your number is " + number);

        for (int i = number; i <= maxElement; i++) sum += i;
        System.out.println("Resalt" + sum);


    }
}
