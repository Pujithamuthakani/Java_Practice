import java.util.*;
public class Multi{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    int i=1;
    while(i<=30){
     System.out.println(n+"*"+i+"="+n*i);
      i++;
    }
}
}