import java.util.*;
class Student
  {
    private int rollnum;
    private String name;
    void setRollnum(int rollnum)
    {
      this.rollnum=rollnum;
    }
    int getRollnum()
    {
      return this.rollnum;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
  }
class Encapsulation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student st=new Student();
      System.out.println("Enter rollnum");
      st.setRollnum(sc.nextInt());
      System.out.println("Enter name");
      st.setName(sc.next());
      System.out.println(st.getRollnum()+st.getName());
      
        }
  }