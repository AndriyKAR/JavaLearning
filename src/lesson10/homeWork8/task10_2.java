package lesson10.homeWork8;/*В масиві зберігаються дані про загальну вартість товарів,
        проданих компанією за кожний день березня. Визначити кількість днів,
        в яких вартість проданих товарів перевищує значення s.*/


import java.util.Random;
import java.util.Scanner;

public class task10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter maximum sales value in $ ");
        int salesMaxValue = input.nextInt();
        System.out.println("\nYour best sales will be 20% less then maximum sales values ");

        int s;
        s = salesMaxValue - ((salesMaxValue / 100) * 20);
        System.out.println("\nYour best sales begin to level - " + s + " $");
        int bestSales = s;
        int daysMarch = 31;
        int counterBestSales = 0;
        int sumSales = 0;


        int[] March = new int[daysMarch];

        for (int i = 1; i < daysMarch; i++) {
            March[i] = random.nextInt(salesMaxValue);
            sumSales+=March[i];

            if (March[i] > bestSales) {
                counterBestSales++;
            }
            System.out.println( March[i]);
            // запускаю, щоб бачити які числа генерує рендом просто з інтересу
        }
        System.out.println("March sales days result - " + counterBestSales);
        System.out.println("Total sum of March sales - " + sumSales + "$");
        // Тепер це завдання ше треба превести в double

    }
}
