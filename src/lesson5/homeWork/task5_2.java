package lesson5.homeWork;
/*Знайти середнє арифметичне
 всіх цілих чисел від 50 до b (значення b вводиться з клавіатури b≥50).
  */
import java.util.Scanner;

public class task5_2 {
    public static void main(String[] args) {
        double sum = 0;
        double medium = 0;
        int counter = 0;
        int startValue = 50;

        System.out.println("Enter same  number more 50");
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();

        if (number < startValue) {
            System.out.println("Number out of range");
        }else{
            for (int i = startValue; i<=number; i++) {
                sum +=i;
                counter++;
            }

            System.out.println("Sum = " + sum);

            medium = sum / counter;
            System.out.println("Medium = "+medium);
        }
    }
}






