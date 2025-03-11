import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static int m;
    static HashSet<Integer> set;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        set = new HashSet<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());
            if(set.contains(num)){
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
}