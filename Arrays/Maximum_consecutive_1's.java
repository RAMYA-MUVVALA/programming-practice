import java.util.*;
import java.lang.*;
class Maximum_consecutive_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr size of an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                count++;
                max=Math.max(count,max);
            }
            else
            {
                count=0;
            }
        }
        System.out.println("Maximun consecutive 1's in given array is: "+max);
    }
}
