package com.company.lesson3;

import java.util.Scanner;


public class lesson3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x, y, z; // variables
        double min = 1, max = 30;

        System.out.print("Enter x=");
        x = input.nextInt();
        System.out.print("Enter y=");
        y = input.nextInt();
        System.out.print("Enter z=");
        z = input.nextInt();

        if (x > 1) {
            if (x < 30) {
            }
        }

        if((x>1)&&(x<30)){
            // inside range
        }

        if((x<=1)||(x>=30) ){
            x/=10;
        }
        if ((y <= 1) || (y >= 30)) {
            y /= 10;
        }
        if ((z <= 1) || (z >= 30)) {
            z /= 10;
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);



    }
}

/*

A -> (x<=1)
B -> (x>=30)
0 -> false
1 - -> true


A   B   &&  ||
0   0   0   0
1   0   0   1
0   1   0   1
1   1   1   1

 */
