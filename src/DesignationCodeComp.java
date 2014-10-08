public class DesignationCodeComp implements Comparator
{
    String validDesignation = {"cmd","ceo","cto","p", "vp", "gm", "m","a"};
    
    public int compare(Object obj1,Object obj2)
    {
        int index1,index2;
        String des1, des2;
        des1 = ((Employee)obj1).designation;
        des2 = ((Employee)obj2).designation;
        index1 = -1;
        for(int i=0;i<validDesignation.length;i++)
        {
            if(des1.equals(validDesignation[i]))
            {
                index1 = i;
                break;
            }
        }
        if(index1==-1) throws RuntimeException(" Invalid Designation");
        
        for(int i=0;i<validDesignation.length;i++)
        {
            if(des2.equals(validDesignation[i]))
            {
                index2 = i;
                break;
            }
        }
        if(index2==-1) throws RuntimeException(" Invalid Designation ");
        
        
    }
}