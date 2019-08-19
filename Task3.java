/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int number,rem, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println("Sum of Digits:"+sum);
        
    }
    
}
