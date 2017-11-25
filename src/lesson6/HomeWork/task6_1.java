package lesson6.HomeWork;
/*Знайти середнє арифметичне
 всіх цілих чисел від а до 300 (значення а вводиться з клавіатури; a≤300).
  */

import java.util.Scanner;

public class task6_1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int sum = 0;
        int number = 300;
        int counter = 0;

        System.out.println("Enter startValue, same number less or equal than 300");
        System.out.print("Your startValue =");
        int a = Scan.nextInt();

        while (a <= number) {
            sum += a;
            a++;
            counter++;
        }
        System.out.println("sum=" + sum);

        System.out.println("avg="+(sum/counter));


    }


}


