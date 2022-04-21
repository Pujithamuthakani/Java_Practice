import java.util.*;
class ArrayN{
  public static void main(String args[]){
    int a[]=new int[5];
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
      }
    System.out.println("Negative Array elements are");
    for(int i=0;i<5;i++){
     if(a[i]<0)
     {
       
       System.out.println(a[i]);
     
    }
      }
      
    }
  }