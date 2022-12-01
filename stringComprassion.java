import java.util.Scanner; 
public class stringComprassion
{
    public static String comparision(String str)
    {
        String ans = ""+str.charAt(0);
        for(int i =1 ;i<str.length();i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (curr!=prev)
                ans+=curr;
        
        }
        return ans;
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        String str = scn.next();
        String answer= comparision(str);
        System.out.println(answer);
    }
}