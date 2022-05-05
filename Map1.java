import java.util.*;
public class Map1
{
  public static void main(String args[])
  {
    HashMap<Integer,String>map=new HashMap<Integer,String>();
    map.put(1,"Rose");
     map.put(2,"van");
     map.put(3,"car");
     map.put(4,"pen");
     map.put(5,"lapi");
    for(Map.Entry m:map.entrySet())
      {
        System.out.println(m.getKey()+" "+m.getValue());
      }
    //System.out.println(map);
  }
}