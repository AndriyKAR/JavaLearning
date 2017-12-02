package lesson10.homeWork8;

import java.util.Random;
import java.util.Scanner;

public class task10_2 {
    /*В масиві зберігаються дані про загальну вартість товарів,
        проданих компанією за кожний день березня. Визначити кількість днів,
        в яких вартість проданих товарів перевищує значення s.*/
    static Scanner input = new Scanner(System.in);
    static double[] MarchSells;

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
                    System.out.print("Enter data numbers: ");
                    int quatity = input.nextInt();
                    MarchSells = new double[quatity];
                    generateData(MarchSells);
                    break;
                case 2:
                    showData(MarchSells);
                    break;
                case 3:
                    firstSearch(MarchSells);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong menu number");
            }
        } while (true);

    }

    public static void generateData(double[] March) {
        Random random = new Random();
        for (int i = 0; i < March.length; i++) {
            March[i] = random.nextInt(1001) + random.nextDouble();
        }
    }

    public static void showData(double[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            System.out.println("[" + i + "] = " + someArray[i]);
        }
    }

    public static void firstSearch(double[] someArray) {
        System.out.print("Enter value number: ");
        int values = input.nextInt();
        int counter = 0;

        for (int i = 0; i <someArray.length ; i++) {
            if (someArray[i]>values){
                System.out.println("[" + (i +1)+ "] = " + someArray[i]);
                counter++;
            }
        }
        System.out.println("Day numbers: "+counter);
    }
}
