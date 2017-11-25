package lesson7.homeWork;
/*Знайти добуток квадратних коренів всіх цілих чисел від 4 до 20.*/


import java.util.Scanner;

public class task7_3 {
    public static void main(String[] args) {
        double minNumber = 4;
        int maxNumber = 20;
        double sum = 0;

        while (minNumber != maxNumber) {
            sum = sum + Math.pow(minNumber, 2);
            minNumber++;
        }
        System.out.println("Sum -  " + sum);
    }
}
