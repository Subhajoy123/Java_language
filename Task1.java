/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// finding the area and perimeter of a circle
package task1;

import java.util.Scanner;

/**
 *
 * @author subhajoy
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println(" enter ther radius of the circle ");
        double r;
        
        Scanner s= new Scanner(System.in) ; 
        r=s.nextDouble()  ;
        double a ; 
        a=3.14*r*r ; 
        double pe ;
        pe = 2*3.14*r;
        System.out.println(" the area is ="+ a + " the perimeter is "+ pe) ; 
    }
    
}
