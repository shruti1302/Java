/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.util.Scanner;

/**
 *
 * @author shruti
 */
public class Task6 {

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        if(num>0)
            System.out.println("The number is positive.");
        else if(num<0)
            System.out.println("The number is negative");
        else System.out.println("Zero is entered.");
    }
    
}
