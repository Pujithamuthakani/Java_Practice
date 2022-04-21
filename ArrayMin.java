import java.util.*;
class ArrayMin{
  public static void main(String args[]){
    int a[]=new int[5];
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
      }
    int min=a[0];
    System.out.println("Array elements are");
    for(int i=0;i<5;i++){
     if(a[i]<min){
       min=a[i];
     
    }
      }
      System.out.println(min);
    }
  }
