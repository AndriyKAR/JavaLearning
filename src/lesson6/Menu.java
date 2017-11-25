package lesson6;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int user_choise = 0;

        do {
            System.out.println("1 - Show information");
            System.out.println("2 - Update information");
            System.out.println("3 - Delete information");
            System.out.println("0 - Exit");

            System.out.print("\nPlease enter menu number: ");
            user_choise = Scan.nextInt();

            switch (user_choise) {
                case 1:
                    System.out.println("Showing information");
                    break;
                case 2:
                    System.out.println("Updating information");
                    break;
                case 3:
                    System.out.println("Deleting information");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong menu number");
            }
        } while (true);


    }
}
