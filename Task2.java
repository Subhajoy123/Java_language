/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Adding two binary no.s
package task2;
import java.lang.Math;
import java.util.Scanner ; 
class dec{
    
    int todec(int n){
        int d,s=0,i=0 ; 
        while(n>0){
            d=n%10 ; 
            n=n/10 ; 
            s=(int) (s+d*Math.pow(2,i)) ; 
            i++ ; 
        }
    return s ; 
    }
   
}

/**
 *
 * @author subhajoy
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,i=0;
        int p[]=new int[10] ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter first binary no.") ; 
        a=s.nextInt() ; 
        System.out.println(" enter second binary no.") ; 
        b=s.nextInt() ; 
        dec x=new dec() ; 
        int z= x.todec(a)+x.todec(b) ; 
        while(z>0){
            p[i++]=z%2 ; 
            z=z/2 ; 
        }
        for(int j=i-1 ; j>=0 ; j--){
            System.out.print(p[j]);
        
    }
        System.out.println();
   }   
}
