package lesson10.homeWork8;/*В масиві зберігаються дані про загальну вартість товарів,
        проданих компанією за кожний день березня. Визначити кількість днів,
        в яких вартість проданих товарів перевищує значення s.*/


import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class task10_2 {
    public static void main(String[] args) {
        //Start task
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter maximum sales value in $ ");
        double salesMaxValue = input.nextDouble();
        System.out.println("\nYour best sales will be 20% less then maximum sales values ");

        double s;
        s = salesMaxValue - ((salesMaxValue / 100) * 20);
        System.out.println("\nYour best sales begin to level - " + s + " $");
        double bestSales = s;
        int daysMarch = 31;
        int counterBestSales = 0;
        double sumSales = 0;


        double[] March = new double[daysMarch];


        for (int i = 1; i < daysMarch; i++) {

            March[i] = random.nextInt(800) + random.nextDouble();// при вказуванні bestSales
            // вибиває помилку по double
            sumSales += March[i];

            if (March[i] > bestSales) {
                counterBestSales++;
            }/*
            BigDecimal x = new BigDecimal(March[daysMarch]);
            x = x.setScale(2, BigDecimal.ROUND_HALF_UP);*/
            System.out.println(March[i]);
            // запускаю, щоб бачити які числа генерує рендом просто з інтересу
        }
        System.out.println("March sales days result - " + counterBestSales);
        System.out.println("Total sum of March sales - " + sumSales + "$");
        // Тепер це завдання ше треба превести в double
        // New Line

    }
}
