/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raveen_2
 */
import java.util.*;
public class Q5 {
    public static void main(String[]args){
    
        Scanner in=new Scanner(System.in);
        System.out.println("enter avg: ");
        double avg=in.nextDouble();
        
        if(avg<=100&&avg>=90)
            System.out.println("4");
        if(avg<=89&&avg>=980)
            System.out.println("3");
        if(avg<=79&&avg>=70)
            System.out.println("2");
        if(avg<=69&&avg>=60)
            System.out.println("1");
        if(avg<60)
            System.out.println("0");
    
    }
}
