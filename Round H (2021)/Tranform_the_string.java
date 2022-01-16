/**
 * Tranform_the_string
 */
// Time Complexity:O(n*n)
import java.util.*;
public class Tranform_the_string {
    public static int check(String s,char c) {
        int ch_i=0,c_i=c;
        int arr[]=new int[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            ch_i=ch;
            arr[count++]=(int)(Math.abs(ch_i-c_i));
        }
        Arrays.sort(arr);
        return(arr[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            String s1=sc.next();
            sc.nextLine();
            String s2=sc.next();
            int sum = 0;
            for(int j=0;j<s1.length();j++)
            {
                char c= s1.charAt(j);
                sum=sum+check(s2,c);
            }
            System.out.println("Case #"+i+": "+sum);
        }
        sc.close();
    }
}