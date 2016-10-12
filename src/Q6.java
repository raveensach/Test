/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raveen_2
 */
import java.util.*;
public class Q6 {
    public static void main(String[]args){
        
        int[]a1=new int[]{10,19,35,70,68,25};
        
        int sum=0;
        for(int i=0;i<a1.length;i++)
            sum=sum+a1[i];
        
        double avg=sum/a1.length;
        System.out.println(avg);
        
        Arrays.sort(a1);
        for(int e:a1)
            System.out.print(","+e);
            
        
        int len=a1.length;
        System.out.println("\n"+len);
        double med;
        if(len%2==0){
            med=(a1[(len/2)-1]+a1[(len/2)])/2;
        }
        else
            med=a1[(len/2)];
            
        System.out.println(med);
    }
}
