class ClassEmployee{
  //properties
  String name;
  int id;
  String dep;
  long sal;
public static void main(String args[])
  {
    //initializing values
    Employee em1=new Employee();
    em1.name="Puja";
    em1.id=45;
    em1.dep="ECE";
    em1.sal=35000;
       Employee em2=new Employee();
    em2.name="Sam";
    em2.id=48;
    em2.dep="ECE";
    em2.sal=45000;
    // print the result
       System.out.println(em1.name+" "+em1.id+" "+em1.dep+" "+em1.sal+" ");
    System.out.println(em2.name+" "+em2.id+" "+em2.dep+" "+em1.sal+" ");
    }
 
  }