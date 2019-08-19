/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

import java.util.Scanner;

/**
 *
 * @author shruti
 */
public class Task5 {

    public static void main(String[] args) {
        double min, days, years;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        min = sc.nextDouble();
        days = min/(24*60);
        years = min/(365*24*60);
        System.out.println(min+" minutes are "+days+" days and "+years+" years.");


        
    }
    
}
