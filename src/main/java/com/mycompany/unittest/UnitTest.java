/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.unittest;

import java.util.Scanner;
import com.mycompany.unittest.Operations;
import java.util.Random;

/**
 *
 * @author vicjo
 */
public class UnitTest {

    static Scanner sc = new Scanner(System.in);
    static Operations o = new Operations();

    public static void main(String[] args) {
        System.out.println("Select one of the numbers below");
        System.out.println("1. Add next number.");
        System.out.println("2. Random number plus 30%.");
        System.out.println("16. Sum of digits, the maximun of digits is four");
        System.out.print("Your selection: ");

        String opcion = sc.next();

        switch (opcion) {
            case "1":
                System.out.println("Type an integer number.");
                String number = sc.next();
                int n = Integer.parseInt(number);
                int result = o.nextNumber(n);
                System.out.println("The next number is: " + result);
                break;

            case "2":
                Random ran = new Random();
                int n2 = ran.nextInt(201);
                System.out.println(n2);

                System.out.println(Operations.randomNumer(n2));

                break;

            case "16":
                String digits = sc.next();
                
                if (digits.length()>4) {
                    System.out.println("The limit of digits is four");
                   
                }else{
                    System.out.println(Operations.sumOfDigits(digits));
                }

                break;
            default:
                System.out.println("Equis de");
                ;
        }

    }
}
