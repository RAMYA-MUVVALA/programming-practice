import java.util.*;
class Bubble_sort {
   
    static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elments");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int didswap=0; // to check if input array is already sorted
        for(int i=n-1;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                    didswap=1;
                }
            }
            if(didswap==0)
            {
                break;
            }
        }
      
        System.out.println("After swapping array elemets are :");
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    

// Time complexity=O(n^2) for worst and average cas
// Time complexity=O(n) for best case i.e when taken array is already sorted
}
