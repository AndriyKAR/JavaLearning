package lesson10;

import java.util.Random;
import java.util.Scanner;

/*
Дано масив із n елементів. Знайти суму елементів масиву, значення
яких не перевищує 20.
 */
public class lesson10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int summ = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(40);
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] < 20) {
                summ += numbers[i];
            }
        }

        System.out.println("Summ  = " + summ);
    }
}
