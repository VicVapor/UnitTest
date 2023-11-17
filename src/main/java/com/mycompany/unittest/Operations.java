/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vicjo
 */
public class Operations {

    public static int nextNumber(int n) {

        return n + 1;

    }

    public static int randomNumer(int n) {

        int n30 = (int) (n + (n * 0.3));

        return n30;
    }

    public static int sumOfDigits(String digits) {
        int suma = 0;

        char[] aux = digits.toCharArray();

        System.out.println("Cadena: " + digits);
        
        
        
        for (char i : aux) {
            String str = new Character((char) i).toString();
            suma+=Integer.parseInt(str);
        }

        // System.out.println("Suma total: "+suma);
        return suma;
    }

}
