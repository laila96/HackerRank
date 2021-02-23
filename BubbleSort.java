import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swap = 0;
        for(int i =0; i< n-1; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    swap++;
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                    
                }
            }
            if (swap == 0) {
                break;
            }
        }
      
    System.out.println("Array is sorted in "+ swap +" swaps.");
    System.out.println("First Element: "+ a[0]);
    System.out.println("Last Element: "+ a[n - 1]);
    }
}
