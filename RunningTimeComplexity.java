import java.io.*;
import java.util.*;

public class Solution {

    static void isPrime(int[] numbers){
        
        for(int i=0; i<numbers.length; i++){
            boolean isprime = true;
            for(int j=2; j<numbers[i]; j++){
                if(numbers[i] % j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println("Prime");
            } 
            else {
                System.out.println("Not prime");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n]; 
        for(int i =0; i<n ; i++){
            numbers[i] = sc.nextInt();
        }
        
        isPrime(numbers);
    }
}
