import java.util.*;
public class Prime{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int d=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                d++;
            }
            if(d==0)
            System.out.println(i);
        }
    }
}
