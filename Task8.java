/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// counting vowels in a string
package task8;
import java.util.Scanner ; 
class vo{
    int vcount(String s){
        int c=0 ; 
        s= s.toLowerCase() ; 
        for(int i=0 ;i<s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
                c++ ; 
        }
    return c;
    }
     
}
/**
 *
 * @author subhajoy
 */
public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String p =new String() ;
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" enter the string ");
        p=s.nextLine();
        vo x= new vo() ; 
        System.out.println(" The no. of vowels "+x.vcount(p));
        
         
    }
    
}
