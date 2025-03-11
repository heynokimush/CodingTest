import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        if(strLen >= 1 && strLen <= 1000000){
            System.out.println(str);
        }
    }
}