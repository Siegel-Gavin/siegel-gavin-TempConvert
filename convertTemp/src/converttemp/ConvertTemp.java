/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

/**
 *
 * @author gjwsi
 */

import java.util.Scanner;

public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double cel, fah;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius:");
        cel = keyboard.nextDouble();

        fah = (cel * 1.8)+ 32;

        System.out.println("Temperature in Fahrenheit:"+fah);        
    }
    
}
