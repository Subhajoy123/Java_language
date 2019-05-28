/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// conversion from inches to meters
package task4;
import java.util.Scanner ; 
/**
 *
 * @author subhajoy
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double i ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter any value(in inches) ");
        i=s.nextDouble() ;
        System.out.println(" entered value(in meters) "+0.0254*i);
        
    }
    
}
