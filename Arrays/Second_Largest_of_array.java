import java.util.*;
class Second_Largest_of_array {
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
        int ans=second_largest(a);
        int ans2=second_smallest(a);
        System.out.println("Second Largest element in given array is: "+ans);
        System.out.println("Second smallest element in given array is :"+ans2);
    }
    public static int second_largest(int[] a){
        int largest=a[0];
        int s_l=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                s_l=largest;
                largest=a[i];
            }
            else if(a[i]>s_l && a[i]<largest)
            {
                s_l=a[i];
            }
        }
        return s_l;

    }
    public static int second_smallest(int[] a)
    {
        int smallest=a[0];
        int s_s=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<smallest)
            {
                s_s=smallest;
                smallest=a[i];
            }
            else if(a[i]<s_s && a[i]>smallest )
            {
                s_s=a[i];
            }
        }
        return s_s;
    }
}
/*Better approach is 
find largest elment of the array  and stored in largest variable
int second_largest=-1;
for(int i=0;i<n;i++)
{
if(a[i]>second_largest && a[i]!=largest)
{
second_largest=a[i];
}
}
*/