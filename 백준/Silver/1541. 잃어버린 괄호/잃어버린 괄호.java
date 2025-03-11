import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] mArr = br.readLine().split("-");
        
        int minus = 0;
        for(int i=0; i<mArr.length; i++){
            String[] pArr = mArr[i].split("\\+");
            
            int sum = 0;
            for(int j=0; j<pArr.length; j++){
                sum += Integer.parseInt(pArr[j]);
            }
            
            if(i==0) minus += sum;
            else minus -= sum;
        }

        System.out.println(minus);
        
        br.close();
    }
}