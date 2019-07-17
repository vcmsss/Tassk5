package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number 2:");
        int num2 = sc.nextInt();

        System.out.println("The product of the numbers:" + " " + num * num2);
    }
}

