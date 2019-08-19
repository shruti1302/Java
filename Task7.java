/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author shruti
 */
public class Task7 {

    public static void main(String[] args) {
        int a[][]={{5,6,4},{6,4,3},{3,7,5}};    
        int b[][]={{1,1,4},{7,4,6},{1,9,4}};    
    
        int c[][]=new int[3][3]; 
    
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=a[i][j]+b[i][j]; 
                System.out.print(c[i][j]+"      ");    
            }    
        System.out.println();
        }    
    }
    
}
