import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int[] dArr = {x, y, w-x, h-y};
        int min = x;
        for(int d : dArr){
            if(min > d){
                min = d;
            }
        }
        
        System.out.print(min);
        br.close();
    }
}