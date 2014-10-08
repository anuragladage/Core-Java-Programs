import java.util.*;

public class TestCollections
{
    public static void main(String args[])
    {
        Vector v;
        v = new Vector(100);
//        v1 = new Vector(100,15);  //Capacity and Increment Rate.
        v.add("Tom");
        v.add("Anurag");
        v.add("Rabbit");
//        v.add(new Float(10.81f));
//        v.add(new Integer(100));
        v.add("Mikado Solutions");
        
        
//        String s = (String)v.elementAt(0);
//        System.out.println(s);
     
        
        for(int i = 0; i<v.size();i++)
        {
           String s1 = (String)v.elementAt(i);
           System.out.println(s1);
        }
        System.out.println("__________________________________________");
        
        
        
        
        Enumeration e;          //Doesnt guarantee order.
        e = v.elements();
        while(e.hasMoreElements())
        {
            String s = (String)e.nextElement();
            System.out.println(s);
        }
        System.out.println("__________________________________________");
        //Similarly to enumeration after 1.5 there came one more type Iterator. Iterator has smaller methods as compared to enumerator and an extra method .remove().
        
        Iterator i;
        i = v.iterator();
        
        while(i.hasNext())
        {
            String s=(String)i.next();
            System.out.println(s);
        }
    }
}