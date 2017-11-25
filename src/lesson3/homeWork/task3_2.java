package lesson3.homeWork;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int FirstNumber = 0;


        System.out.print("Enter x=");
        x = input.nextInt();
        System.out.print("Enter y=");
        y = input.nextInt();

        if (x >= y) {
            System.out.println("The First Number " + x + " - Without change;");
            System.out.println("The Second Number " + y + " - Without change;");
        } else {
            x = FirstNumber;

            System.out.print("Result - The First Number is changed to " + FirstNumber + ";");
        }
    }


}

