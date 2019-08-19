/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;
import java.math.*;
import java.util.Scanner;

/**
 *
 * @author shruti
 */
public class Task10 {

    public static void main(String[] args) {
        int num, cube;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number:");
        num = sc.nextInt();
        for(int i =1; i<=num; i++)
        {
            cube= (int) Math.pow(i, 3);
            System.out.println("Number is "+i+" and the cube is "+cube);
        }
    }
    
}
