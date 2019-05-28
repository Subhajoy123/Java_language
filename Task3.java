/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// finding sum of the digits of the integer
package task3;
import java.util.Scanner ; 
/**
 *
 * @author subhajoy
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,d,p=0 ;
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter any integer ");
        i=s.nextInt() ;
        while(i>0){
            d=i%10 ; 
            i=i/10 ; 
            p=p+d;
        
        }
        System.out.println(" The sum of digits of the integer is "+p);
    }   
}
