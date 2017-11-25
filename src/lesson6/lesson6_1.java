package lesson6;

import java.util.Scanner;

public class lesson6_1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        double sum = 0;
        double medium = 0;
        int counter = 0;
        int startValue = 50;
        int number = 0;

        do {
            System.out.print("Enter same  number more 50 : ");
            number = Scan.nextInt();

            if (number < startValue) {
                System.out.println("Number out of range");
            } else {
                while (startValue <= number) {
                    sum += startValue;
                    startValue++;
                    counter++;
                }
                System.out.println("Sum = " + sum);
                medium = sum / counter;
                System.out.println("Medium = " + medium);
            }
        } while (number < 50);
    }
}
