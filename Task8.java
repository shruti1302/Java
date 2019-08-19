/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

import java.util.Scanner;
/**
 *
 * @author shruti
 */
public class Task8 {

    public static void main(String[] args) {
        int count=0;
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        str= sc.nextLine();
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
                count++;
        }
        System.out.println("Number of vowels in the entered String is "+count);
    }
    
}
