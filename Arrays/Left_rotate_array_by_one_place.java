import java.util.*;
class Left_rotate_array_by_one_place {
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
        int temp=a[0];
        for(int i=1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
