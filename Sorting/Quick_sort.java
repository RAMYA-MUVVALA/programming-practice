import java.util.*;
class Quick_sort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pindex=partition(arr,low,high);
            quicksort(arr, low, pindex-1);
            quicksort(arr, pindex+1, high);
        }
    }
    public static int partition(int[] arr,int low,int high)
    {
        int pivot=low;
        int i=low;
        int j=high;
        while(i<j)
        {
            while(i<=high && arr[i]<=arr[pivot] )
            {
                i++;
            }
            while(  j>low && arr[j]>=arr[pivot])
            {
                j--;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;

    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
