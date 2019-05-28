/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// finding the smallest among 3 no.s 
package task9;

import java.util.Scanner;

class gtet{
    void dis(int x, int y , int z){
        if( x<=y && x<=z)
            System.out.println(x+" is the smallest ");
        else if( y<=x && y<=z)
            System.out.println(y+" is the smallest ");
        else
            System.out.println(z+" is the smallest ");
    }
}
/**
 *
 * @author subhajoy
 */
public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z ; 
        Scanner s= new Scanner(System.in) ; 
        System.out.println(" Enter three no.s ");
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        gtet g= new gtet();
        g.dis(x, y, z);
        
    }
}
