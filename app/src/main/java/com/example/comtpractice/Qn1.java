package com.example.comtpractice;

import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        //This is to accept the first user input
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Second number: ");
        int secondNum = input.nextInt();

        if(firstNum>secondNum)
        {
            System.out.println("\n" + firstNum);
        }
        else{
            System.out.println(secondNum);
        }
    }
}
