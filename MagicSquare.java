import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

     public static int formingMagicSquare(List<List<Integer>> s) {
         int[][][] r = {{{8,3,4}, {1,5,9}, {6,7,2}}, 
        {{2,7,6},{9,5,1},{4,3,8}}, {{6,1,8},{7,5,3},{2,9,4}},
    {{4,9,2},{3,5,7},{8,1,6}}, {{6,7,2},{1,5,9},{8,3,4}},
{{4,3,8},{9,5,1},{2,7,6}}, {{8,1,6},{3,5,7},{4,9,2}},
{{2,9,4},{7,5,3},{6,1,8}}};

int mincost= Integer.MAX_VALUE;
for (int i = 0; i <r.length; i++){
    int cost = 0;
    for (int j=0; j<3; j++){
        for (int k=0; k<3 ; k++){
            cost = cost + Math.abs(r[i][j][k]-s.get(j).get(k));
        }
    }
    if(cost < mincost){
        mincost = cost;
    }  
 }
        
    return mincost;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}