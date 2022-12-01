import java .util.Scanner; 
public class reverseLetter 
{
    public static String rev(String str)
    {
        String ans=" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            ans=ch+ans;
        }
        return ans;

    }    
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(rev(s));

    }
}
