import java.util.Scanner;
public class reverseSentence 
{
    public static String rev(String str)
    {
        String [] s= str.split(" ");
        String ans=s[s.length-1];
        for(int i=s.length-2;i>=0;i--)
        {
            ans=ans+" "+s[i];
        }
        return ans;
    }
    public static void main (String []args)
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String an=rev(s);
        System.out.println(an);

    }
    
}
