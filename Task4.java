/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author shruti
 */
public class Task4 {

    public static void main(String[] args) {
        float inch, meter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the measurement in inches: ");
        inch = sc.nextFloat();
        meter = (float) (inch*0.0254);
        System.out.println("Measurement in meters is" + meter); 
        
    }
    
}
