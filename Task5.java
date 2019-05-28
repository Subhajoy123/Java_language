/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// conversion of minutes to years and days
package task5;

import java.util.Scanner;

/**
 *
 * @author subhajoy
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m,y,d,r ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter in minutes ");
        m=s.nextInt() ;
        y=m/(60*24*365) ; 
        r=m%(60*24*365) ;
        d=r/(60*24);
        System.out.println(" years: "+y);
        System.out.println(" days: "+d);
    }
    
}
