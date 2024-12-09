import java.util.*;
class fire
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns[]=new int[n];
        int k=0;int s=0;
        for(int i=1;i<n;i++)
        {
            s+=i;
            ns[k]=s;
            k++;
        }
        System.out.println(ns[n/2]);
    }
}
   