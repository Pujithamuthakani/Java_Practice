import java.util.*;
public class SumofEven{
  public static void main(String args[]){
    int Sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int i=0;
    while(i<=n){
      Sum=Sum+i;
      i=i+2;
      }
    System.out.println(Sum);
    }
}