/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.util.Scanner;

/**
 *
 * @author shruti
 */
public class Task9 {

    public static void main(String[] args) {
        int num1,num2,num3,smallest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st number: ");
        num1 = sc.nextInt();
        System.out.println("Input 2nd number: ");
        num2 = sc.nextInt();
        System.out.println("Input 3rd number: ");
        num3 = sc.nextInt();
        if(num1<num2 && num1<num3)
        smallest=num1;
        else if (num2<num3)
            smallest=num2;
        else smallest=num3;
        System.out.println("The smallest number is "+smallest);
        
        
    
    }
    
}
