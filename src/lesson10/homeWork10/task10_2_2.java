package lesson10.homeWork10;

import java.util.Random;
import java.util.Scanner;

public class task10_2_2 {
    static Scanner input = new Scanner(System.in);
    static double[] MarchSales;


    public static void main(String[] args) {
        menu();

    }


    public static void menu() {
        Scanner Scan = new Scanner(System.in);
        int user_choice;

        do {
            System.out.println("\n1 - Generate data");
            System.out.println("2 - Show information");
            System.out.println("3 - First search");
            System.out.println("0 - Exit");

            System.out.print("\nPlease enter menu number: ");
            user_choice = Scan.nextInt();

            switch (user_choice) {
                case 1:
                    System.out.println("Enter data numbers");
                    int quantity = input.nextInt();
                    MarchSales = new double[quantity];
                    generateData(quantity, MarchSales);
                    break;
                case 2:
                    showData(MarchSales);
                    break;
                case 3:
                    firstSearch(MarchSales);
                    break;
                case 4:
                    SalesAverage(MarchSales);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong menu number");
            }
        } while (true);


    }

    public static void generateData(int size, double[] March) {
        Random random = new Random();

        for (int i = 0; i < March.length; i++) {
            March[i] = random.nextInt(1001) + random.nextDouble();
        }

    }

    public static void showData(double[] sameArray) {
        double sumSales = 0;


        for (int i = 0; i < sameArray.length; i++) {

            System.out.println("[" + i + "]=" + sameArray[i]);
        }


    }

    public static void firstSearch(double[] sameArray) {
        System.out.println("Enter value number");
        int values = input.nextInt();
        int counter = 0;

        for (int i = 0; i < sameArray.length; i++) {
            if (sameArray[i] > values) {
                System.out.println("[" + (i + 1) + "]=" + sameArray[i]);
                counter++;
            }
        }
        System.out.println("Day numbers - " + counter);


    }

    public static void SalesAverage(double[] sameArray) {
        double sumSales = 0;

        for (int i = 0; i < sameArray.length; i++) {
            sumSales = sumSales + sameArray[i];

        }

        int counterMediumSales = 0;
        double averageSales;

        averageSales = sumSales / sameArray.length;
        System.out.println("\nValue of medium sales - " + averageSales);


        for (int i = 0; i < sameArray.length; i++) {
            if (averageSales < sameArray[i]) {
                counterMediumSales++;
            }
        }
        System.out.println(" Quantity March days over medium sales - " + counterMediumSales);
    }

}
















