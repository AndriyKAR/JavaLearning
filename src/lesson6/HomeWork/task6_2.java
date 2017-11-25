package lesson6.HomeWork;

public class task6_2 {
    public static void main(String[] args) {

        double medium;
        double sum = 0;
        double counter = 0;
        int minNumber = 1;
        int maxNumber = 300;

        do {
            sum += minNumber;
            minNumber++;
            counter++;

        }
        while (counter < maxNumber);

        medium = sum / counter;
        System.out.println("Sum=" + sum);
        System.out.println("Counter = " + counter);
        System.out.println("Medium = " + medium);


    }
}







