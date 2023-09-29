import java.util.*;
public class pattern {
  public class static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the height of the pattern");
    int n = sc.nextInt();
    for(int i =1 ; i<=n; i++){
      System.out.print("*");
    }
    System.out.println();
    for(int i = 1 ; i<=n-2 ; i++){
      for(int k =n-2 ; k>=i;k--){
        System.out.prtint(" ");
      }
      for(int j=1; j<=i ; j++){
        if (j==1)
          System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 1 ; i<=n; i++){
      System.out.print("*");
      {
      }
    }
  }
  
    
