import java.util.*;
class Selection_sort {
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
        int i=0;
        while(i<n-1)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
                swap(a,i,min);
        
            }
            i++;
        }
        System.out.println("After swapping array elemets are :");
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    
}
