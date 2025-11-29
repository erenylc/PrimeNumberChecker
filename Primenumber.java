/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumber;

import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class Primenumber {
    public static boolean primeCheck(int number) {
     //The number entered cannot be less than 2
     //If it is less than 2, a prime number cannot be found
        if (number<=1){
            System.out.println("The number you entered is not prime!");
            return false;
        }
        
        //If there is a number that divides the number entered by the user, it is not prime.
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                System.out.println("The number you entered is not prime!");
                return false;               
            }
        }
        //The entered number is prime
        System.out.println("The number you entered is prime!");
        return true;
}

    public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
            System.out.print("Enter number:");
            int number= input.nextInt();
            
            primeCheck(number);        
    }
}
