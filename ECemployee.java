import java.util.*;
class Details
  {
    private int emid;
    private String emname;
    private String emdept;
    private long emsalary;
    void setEmid(int emid)
    {
      this.emid=emid;
    }
    int getEmid()
    {
      return this.emid;
    }
    void setEmname(String emname)
    {
      this.emname=emname;
    }
    String getEmname()
    {
      return this.emname;
    }
    void setEmdept(String emdept)
    {
      this.emdept=emdept;
    }
    String getEmdept()
    {
      return this.emdept;
    }
    void setEmsalary(long emsalary)
    {
      this.emsalary=emsalary;
    }
    long getEmsalary()
    {
      return this.emsalary;
    }
  }
class ECemployee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Details dt=new Details();
      Details dt2=new Details();
      System.out.println("Enter Employee id:");
      dt.setEmid(sc.nextInt());
      System.out.println("Enter Employee name:");
      dt.setEmname(sc.next());
      System.out.println("Enter Employee dept:");
      dt.setEmdept(sc.next());
       System.out.println("Enter Employee salary:");
      dt.setEmsalary(sc.nextLong());

      System.out.println("Enter Employee id:");
      dt2.setEmid(sc.nextInt());
      System.out.println("Enter Employee name:");
      dt2.setEmname(sc.next());
      System.out.println("Enter Employee dept:");
      dt2.setEmdept(sc.next());
       System.out.println("Enter Employee salary:");
      dt2.setEmsalary(sc.nextLong());
      System.out.println(dt.getEmid()+" "+dt.getEmname()+" "+dt.getEmdept()+" "+dt.getEmsalary());

      System.out.println(dt2.getEmid()+" "+dt2.getEmname()+" "+dt2.getEmdept()+" "+dt2.getEmsalary());
    }
  }
    
    
  
  
  