package com.example.comtpractice;

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Second number: ");
        int secondNum = input.nextInt();

        System.out.print("Counting: ");
        for(int i = firstNum; i>=secondNum; i--)
        {
            System.out.print(i + " ");
        }
    }
}
