import java.util.*;
class StringPallen
  {
    public static void main(String args[])
    {
      String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.nextLine();
      for(int i=str.length()-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
       System.out.println(rev);
      if(str.equals(rev))
      {
        System.out.println("Its a pallendrome");
      }
      else
      {
         System.out.println("Its  not a pallendrome");
      }
    }
  }