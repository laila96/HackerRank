import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
       // s = "iffactsdontfittotheorychangethefacts";
        String ss = s.trim();
        int len = ss.length();
        double racine = Math.sqrt(len);
        int rows = (int) racine;
        int columns = (int) (racine+1);
        if(len == 1){
            return ss;
        }
        
        else if(rows*columns<len){
            rows = columns;
            columns = columns;
        }
        String result ="";
        if(Math.sqrt(len) == (int) Math.sqrt(len)){
            columns = rows;
        }
        for(int i = 0; i<columns; i++){
            String text = "";
            int index = i;
            for(int j = i; j<rows+i; j++) {
                if(j == i){
                    text = text + ss.charAt(i);
                } else {
                    if(rows == columns || Math.sqrt(len) == (int) Math.sqrt(len)){
                        index = index+rows;
                    }
                     else {
                         index = index+rows+1;
                     }
                     if(index <len){
                       text = text + ss.charAt(index);   
                     }
                   
                }
            }
            result = result + " " + text;
        }
        
        return result.substring(1, result.length());
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
