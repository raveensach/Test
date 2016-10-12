/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raveen_2
 */
import java.util.*;
public class Q2 {
    public static void main(String[]args){
        int i;
        int n=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num=in.nextInt();
        
        for(i=2;i<num;i++){
            n=num%i;
        
        if(n==0){
            System.out.println("Not prime");
            break;
        }
        }
        if(i==num){
            System.out.println("prime");
        }
    }
}
