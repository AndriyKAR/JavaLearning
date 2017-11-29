package lesson10.homeWork10;/*В масиві зберігаються дані про загальну вартість товарів,
        проданих компанією за кожний день березня. Визначити кількість днів,
        в яких вартість проданих товарів перевищує значення s.*/


import java.util.Random;
import java.util.Scanner;

public class task10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter maximum sales value in $ ");
        int  salesMaxValue = input.nextInt();
        System.out.println("\nYour best sales will be 20% less then maximum sales values ");

        double s;
        s = salesMaxValue - ((salesMaxValue / 100) * 20);
        System.out.println("\nYour best sales begin to level - " + s + " $");
        double bestSales = s;
        int daysMarch = 31;
        int counterBestSales = 0;
        double sumSales = 0;


        double[] March = new double[daysMarch];
        int counterDays = 0;


        for (int i = 0; i < daysMarch; i++) {

            March[i] = random.nextInt(salesMaxValue) + random.nextDouble();// при вказуванні bestSales
            // вибиває помилку по double
            sumSales += March[i];
            counterDays++;

            if (March[i] > bestSales) {
                counterBestSales++;
            }
            System.out.println(counterDays + ") - " + March[i]);
            // запускаю, щоб бачити які числа генерує рендом просто з інтересу
        }
        System.out.println("March sales days result - " + counterBestSales);
        System.out.println("\nTotal sum of March sales - " + sumSales + "$");
        // Тепер це завдання ше треба превести в double

        double averageSales;
        int counterMediumSales = 0;
        averageSales = sumSales / daysMarch;
        System.out.println("\nValue of medium sales - " + averageSales);


        for (int i = 0; i < daysMarch; i++) {
            if (averageSales < March[i]) {
                counterMediumSales++;
                System.out.println(March[i]);
            }
        }
        System.out.println(" Quantity March days over medium sales - " + counterMediumSales);

    }
}
