import java.util.Scanner;
public class Weekdays
  {
    public static void main(String args[]){
      int n=2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      switch(n)
        {
          case 1:
            System.out.println("Monday");
            break;
             case 2:
            System.out.println("tuesday");
            break;
             case 3:
            System.out.println("wednesday");
            break;
             case 4:
            System.out.println("thursday");
            break;
             case 5:
            System.out.println("friday");
            break;
             case 6:
            System.out.println("saturday");
            break;
             case 7:
            System.out.println("sunday");
            break;
          default:
            System.out.println("wrong choice");
        }
      }
  }