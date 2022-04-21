class ClassStudent{
  //properties
  String name;
  int rollnum;
  String branch;
public static void main(String args[])
  {
    //initializing values
    Student st1=new Student();
    st1.name="puja";
    st1.rollnum=45;
    st1.branch="ECE";
      Student st2=new Student();
    st2.name="Sam";
    st2.rollnum=46;
    st2.branch="CSE";
    // print the result
       System.out.println(st1.name+" "+st1.rollnum+" "+st1.branch+" ");
    System.out.println(st2.name+" "+st2.rollnum+" "+st2.branch+" ");
    }
 
  }