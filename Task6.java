/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// checking an integer is -ve, +ve or zero
package task6;

import java.util.Scanner;

/**
 *
 * @author subhajoy
 */
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter any integer ");
        i=s.nextInt() ;
        if(i>0)
            System.out.println(" Positive Integer ");
        else if(i<0)
            System.out.println(" Negative Integer ");
        else
            System.out.println(" Zero Integer ");
        
            
        
   
    } 
}
