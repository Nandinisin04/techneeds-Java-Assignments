import java.util.*;
public class prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a!=2 && a%2==0)
        {
            System.out.println("Not Prime");
        }
        else
        {
          for(int i=3;i<=a/2;i++)
          {
            if(a%i==0)
            {
                c++;
            }
          }
          if(c==0)
          System.out.println("Prime");
          else
          System.out.println("Not Prime");
        }
    }
}
