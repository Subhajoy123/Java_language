/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//to display the cube of the numbers upto a given integer
package task10;
import java.util.Scanner ; 
/**
 *
 * @author subhajoy
 */
public class Task10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" Enter the range ");
        r=s.nextInt() ; 
        for(int i=1 ; i<=r ; i++){
            System.out.println(i+" and cube of "+i+" is: "+(i*i*i));
        }
            
    }
    
}
