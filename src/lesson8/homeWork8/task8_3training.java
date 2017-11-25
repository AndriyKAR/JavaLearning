package lesson8.homeWork8;


import java.util.Scanner;

public class task8_3training {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FirstNumber = 0;
        int SecondNumber = 44;
        int counter = 0;
        int oddcounter=0;
        int sumMajorNumbers = 0;
        int sumBiggerPaired = 0;
        int keePaired = 1;
        int stepPaired = 2;
        double procentRelation=0;

        System.out.println("Enter start number");
        FirstNumber = input.nextInt();





        /*if (FirstUserNumber % 2 == 0)
        {
            System.out.println("Number Parn");

        }else{
            System.out.println("Number inpar");
        }*/
        while (counter<10) {
            if (FirstNumber % 2 == 0) {
                System.out.println("" + FirstNumber + ",");
                counter+=1;
                FirstNumber = stepPaired + FirstNumber;
            }
            System.out.println( "Counter paired" + counter);






        }
        System.out.println("Procent" + procentRelation);
        System.out.println("Oll paired  between first and second numbers " + counter);
        System.out.println("Sum major numbers " + sumMajorNumbers);


    }


}


