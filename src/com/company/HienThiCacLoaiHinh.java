package com.company;

import java.util.Scanner;

public class HienThiCacLoaiHinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Draw the triangle");//hinh chu nhat
        System.out.println("2. Draw the Print the square triangle");//4 tam giac vuong 4 goc khac nhau
        System.out.println("3. Draw Print isosceles triangle");//tam giac can
        System.out.println("4.Exit");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i < 4; i++) {
                        System.out.println("\n");
                        for (int j = 1; j < 8; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        System.out.println("\n");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    };


                    for (int i = 4; i >= 1; i--) {
                        System.out.println("\n");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\n");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;

            }
        }

    }
}
