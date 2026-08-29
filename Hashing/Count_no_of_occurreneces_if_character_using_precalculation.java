import java.util.Scanner;
class Count_no_of_occurreneces_if_character_using_precalculation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        int[] hash=new int[23];
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            hash[index]++;
        }
        System.out.println("Enter no of testcases:");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter character");
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
        }

    }
}
