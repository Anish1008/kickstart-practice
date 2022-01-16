//Time Complexity:O(n)
import java.util.*;
public class Painter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int arr[][]=new int[n][3];
            for(int i=0;i<n;i++)
            {
                char ch = s.charAt(i);
                if(ch=='U')
                continue;
                else if(ch=='R')
                arr[i][0]=1;
                else if(ch=='Y')
                arr[i][1]=1;
                else if(ch=='B')
                arr[i][2]=1;
                else if(ch=='O')
                {
                    arr[i][0]=1;
                    arr[i][1]=1;
                }
                else if(ch=='P')
                {
                    arr[i][0]=1;
                    arr[i][2]=1;
                }
                else if(ch=='G')
                {
                    arr[i][2]=1;
                    arr[i][1]=1;
                }
                else if(ch=='A')
                {
                    arr[i][0]=1;
                    arr[i][1]=1;
                    arr[i][2]=1;
                }
            }
            // for(int i=0;i<n;i++)
            // {
            //     for(int k=0;k<3;k++)
            //     {
            //         System.out.println(arr[i][k]);
            //     }
            // }
            int c=0,d=0,e=0,f=0,g=0,h=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i][0]==1)
                {c++;
                // System.out.println("c"+c);
                }
                else if(arr[i][0]!=1)
                {
                    if(c>0)
                    {
                        d++;
                        c=0;
                    }
                }
                if(arr[i][1]==1)
                {e++;
                // System.out.println("e"+e);
                }
                else if(arr[i][1]!=1)
                {
                    if(e>0)
                    {
                        f++;
                        e=0;
                    }
                }
                if(arr[i][2]==1)
                {g++;
                // System.out.println("g"+g);
                }
                else if(arr[i][2]!=1)
                {
                    if(g>0)
                    {
                        h++;
                        g=0;
                    }
                }
            }
            // System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h);
            if(c>0)
            d++;
            if(e>0)
            f++;
            if(g>0)
            h++;
            // System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h);
            System.out.println("Case #"+j+": "+(d+f+h));
        }
        sc.close();
    }
}
