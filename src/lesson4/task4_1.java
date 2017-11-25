package lesson4;


import java.util.Scanner;

public class task4_1 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;

        System.out.println("Enter x=");
        x = input.nextDouble();
        System.out.println("Enter y=");
        y = input.nextDouble();


        if ((x < 0) && (y < 0)) {
            x = Math.abs(x);
            y = Math.abs(y);

        }  if (((x < 0) && (y > 0)) || ((y < 0) && ( x> 0))) {
            x *= 0.5;
            y *= 0.5;
        }
        else if ((0 < x) && (0 < y)) if ((x < 0.5 && x > 2) && (y < 0.5 && y > 2)) {
            x /= 10;
            y /= 10;
        }


        System.out.println("x" + x);
        System.out.println("Y" + y);
    }


}




