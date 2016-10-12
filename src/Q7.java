/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raveen_2
 */
import java.util.*;
public class Q7 {
    public static void main(String[]args){
        
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        int count=0;
        int a2[]={};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                a2[count]=arr[i][j];
                count++;
            }
        }
        for(int e:a2)
            System.out.println(e);
        
        
    }
}
