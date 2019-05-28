/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// matrix addition
package task7;
import java.util.Scanner ; 


/**
 *
 * @author subhajoy
 */
public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r,c;
        Scanner s= new Scanner(System.in) ;
        System.out.println(" enter the no. of rows ");
        r=s.nextInt();
        System.out.println(" enter the no. of columns ");
        c=s.nextInt(); 
        int a[][] = new int[r][c] ; 
        int b[][] = new int[r][c] ;
        int sum[][] = new int[r][c] ; 
        System.out.println(" enter the first matrix ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                a[i][j]=s.nextInt() ; 
            }
        
        }
        System.out.println(" enter the second matrix ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                b[i][j]=s.nextInt() ; 
            }
        
        }
        
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                sum[i][j] = a[i][j]+b[i][j] ;  
            }
        
        }
        System.out.println("  the first matrix ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                 System.out.print(a[i][j]+ " ");
            }
            System.out.println() ; 
        
        }
        System.out.println("  the second matrix ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                 System.out.print(b[i][j]+ " ");
            }
            System.out.println() ; 
        
        }
        System.out.println(" enter the resultant matrix ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                 System.out.print(sum[i][j]+ " ");
            }
            System.out.println() ; 
        
        }
        
    }
    
}
