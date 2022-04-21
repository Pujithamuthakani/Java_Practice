import java.util.*;
class ArrayMax{
  public static void main(String args[]){
    int a[]=new int[5];
   int max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    for(int i=0;i<5;i++)
      {
      a[i]=sc.nextInt();
      }
     
    System.out.println("Array elements are");
    for(int i=0;i<5;i++)
    {
     if(a[i]>max)
     {
       max=a[i];
     
    }
      }
       System.out.println(max);
    }
  }
