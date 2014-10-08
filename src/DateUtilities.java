package mylib.utils;

public class DateUtilities
{
    public static boolean verifyDate(String strDate)
    {
//        if(strDate.length != 1)
//        {
//            System.out.println("Invalid Argument List");
//            System.out.println("USAGE : java VerifyDate 12/12/1980");
//            System.exit(0);
//        }
        
        int pos1, pos2;
        String sd,sm,sy;
        int d,m,y;
        pos1 = strDate.indexOf("/");
        if(pos1 != -1)
        {
            pos2 = strDate.indexOf("/",pos1 + 1);
            if(pos2 != -1)
            {
                sd = strDate.substring(0,pos1);
                d = Integer.parseInt(sd);
                sm = strDate.substring(pos1 + 1,pos2);
                m = Integer.parseInt(sm);
                sy = strDate.substring(pos2+1);
                y = Integer.parseInt(sy);
                if(y>=1900 && y<3000)
                {
                    if(m <13)
                    {
                        if(d<32)
                        {
                            if(y%4 == 0)
                            {
//                                System.out.println("This is a Leap Year");
                                if(m ==2)
                                {
                                    if(d<30)
                                    {
                                        return true;
                                    }
                                    else
                                    {
                                        return false;
                                    }
                                }
                                else if(m==4 || m==6 || m ==9 || m==11)
                                {
                                    if(d<=30)
                                    {
                                        return true;
                                    }
                                    else
                                    {
                                        return false;
                                    }
                                }
                                else
                                {
                                    return true;
                                }
                            }
                            else
                            {
//                                System.out.println("This is not a leap year");
                                if(m ==2)
                                {
                                    if(d<29)
                                    {
                                        return true;
                                    }
                                    else
                                    {
                                        return false;
                                    }
                                }
                                else
                                {
                                    if(m==4 || m==6 || m ==9 || m==11)
                                    {
                                        if(d<=30)
                                        {
                                            return true;
                                        }
                                        else
                                        {
                                            return false;
                                        }
                                    }
                                    else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
                                    {
                                        if(d<=31)
                                        {
                                            return true;
                                        }
                                        else
                                        {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
        return false;
    }
}