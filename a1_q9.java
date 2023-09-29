import java.util.*;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second  number : ");
        int n2 = sc.nextInt();
        int temp1 = n1;
        int temp2 = n2;

        while (n1 % n2 != 0)
        {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
