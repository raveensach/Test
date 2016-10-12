/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raveen_2
 */
import java.util.*;
public class Q3 {
    public static void main(String[]args){
        
      //  Scanner in=new Scanner(System.in);
      //  System.out.println("Enter an int");
      //  int n=in.nextInt();
        int n=7631;
        
        int []a1=new int[4];
        
        int d1=n%10;
        int d2=(n/10)%10;
        int d3=(n/100)%10;
        int d4=(n/1000)%10;
        
        int num=(d1*1000)+(d2*100)+(d3*10)+d4;
        System.out.println(num);
        
    }
}
