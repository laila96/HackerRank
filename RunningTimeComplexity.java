import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    static void isPrime(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            boolean prime = true;
            if (numbers[i] < 2){
                prime =  false;
            }
            double numberDouble = numbers[i];
            double sqrt = Math.sqrt(numberDouble);
            for(int j=2; j<sqrt+1; j++){
                if(numbers[i] == 2){
                    prime = true;
                    break;
                }
                else if(numbers[i] % j == 0){
                    prime =  false;
                }
            }
            if(prime){
                System.out.println("Prime");
            } else {
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
