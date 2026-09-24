import java.util.*;
class Largest_element_of_array {
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
        int largest=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
