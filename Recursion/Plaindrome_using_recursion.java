import java.util.Scanner;
class Plaindrome_using_recursion {
    public static boolean palindrome(String str,int i)
    {
        if(i>=str.length()/2)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        {
            return false;
        }
        return palindrome(str, i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean ans=palindrome(str, 0);
        if(ans)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
