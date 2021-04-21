package com.algorithms.numeric;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number = scanner.nextInt();

        if (number > 1){
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    System.out.println("Not Prime Number");
                    break;
                }
                else{
                    System.out.println("Prime");
                    break;
                }
            }
        }
        else{
            System.out.println("Not a prime");
        }


    }

}
