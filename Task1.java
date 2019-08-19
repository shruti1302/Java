/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.lang.Math;
import java.util.Scanner;


/**
 *
 * @author shruti
 */
class Task1 {
    
    public static void main(String[] args) {
        double area, perimeter, radius;
        System.out.println("Enter the radius of circle: ");
        Scanner sc=new Scanner(System.in);
        radius = sc.nextFloat();
        area= Math.PI*radius*radius;
        perimeter= Math.PI*2*radius;
        System.out.println("Perimeter of circle: "+perimeter);
        System.out.println("Area of circle: "+area); 
}
    
}
