import java.util.*;
class ArrayTD{
  public static void main(String args[]){
    int a[][]=new int[2][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++){
      a[i][j]=sc.nextInt();
      }
    System.out.println("Array elements are");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++)
        
      {
     a[i][j]=sc.nextInt();
      System.out.println(a[i][j]);
    }
      
    }
  }
    }
}
