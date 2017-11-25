package lesson10.homeWork8;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

/*
Відомі дані про кількість опадів, які випали за кожний день лютого.
Знайти загальну кількість опадів, які випали по парних числах
місяця.
 */
public class task10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Enter amount of February,s days - 28.");
        System.out.println("If it is Leap-years February enter amount of days - 29.");
        System.out.println("Enter amount of days: ");
        int amountDays = input.nextInt();

        int[] fallout = new int[amountDays];
        int FalloutDiff = 20;
        int FirstDay = 0;
        double sumFallout = 0.0;
        int counter = 0;
        int dryDay = 0;
        int stormDay = 0;
        int dryLevel = 2;
        int stormLevel = 18;


        for (int i = FirstDay; i < amountDays; i++) {
            fallout[i] = random.nextInt(FalloutDiff);
            counter++;
            System.out.println("[" + counter + "]" + (fallout[i] + random.nextDouble()));

            if (counter % 2 == 0) {
                sumFallout += (double) fallout[i];//??? не можу вивести sumFallout d duoble
            }
            if (fallout[i] < dryLevel) {
                dryDay += 1;
            }
            if (fallout[i] > stormLevel) {
                stormDay += 1;
            }
        }//не вдаэться вивести числа в double

        BigDecimal x = new BigDecimal( sumFallout);
        x=x.setScale(3,BigDecimal.ROUND_HALF_UP);//скоротив частину числа після коми до трьх знаків

        System.out.println("Sum fallout paired days = " + x);
        System.out.println("Dry days - " + dryDay);
        System.out.println("Rainy days with storm - " + stormDay);

    }
}







