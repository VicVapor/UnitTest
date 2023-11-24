/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittest;

/**
 *
 * @author vicjo
 */
public class Operations {

    public static int nextNumber(int n) {

        return n + 1;

    }

    public static int randomNumer(int n) {

        return (int) (n + (n * 0.3));
    }

    public static int sumOfDigits(String digits) {
        int suma = 0;

        char[] aux = digits.toCharArray();

        System.out.println("Cadena: " + digits);
        
        
        
        for (char i : aux) {
            String str = Character.toString(i);
            suma+=Integer.parseInt(str);
        }

        // System.out.println("Suma total: "+suma);
        return suma;
    }

}
