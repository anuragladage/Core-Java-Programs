public class VerifyDate
{
    public static void main(String[] strDate)
    {
        if(strDate.length != 1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java VerifyDate 12/12/1980");
            System.exit(0);
        }

        int pos1, pos2;
        String sd,sm,sy;
        int d,m,y;
        pos1 = strDate[0].indexOf("/");
        if(pos1 != -1)
        {
            pos2 = strDate[0].indexOf("/",pos1 + 1);
            if(pos2 != -1)
            {
                sd = strDate[0].substring(0,pos1);
                d = Integer.parseInt(sd);
                sm = strDate[0].substring(pos1 + 1,pos2);
                m = Integer.parseInt(sm);
                sy = strDate[0].substring(pos2+1);
                y = Integer.parseInt(sy);
                if(y>=1900 && y<3000)
                {
                    if(m <13)
                    {
                        if(d<32)
                        {
                                if(y%4 == 0)
                                {
                                    System.out.println("This is a Leap Year");
                                    if(m ==2)
                                    {
                                        if(d<30)
                                        {
                                            System.out.println("This is a valid Date");
                                        }
                                        else
                                        {
                                            System.out.println("Enter a Valid Day");
                                        }
                                    }
                                    else if(m==4 || m==6 || m ==9 || m==11)
                                    {
                                            if(d<=30)
                                            {
                                                System.out.println("The date is valid");
                                            }
                                            else
                                            {
                                                System.out.println("This month has only 30 days");
                                            }
                                    }
                                    else
                                    {
                                         System.out.println("This is a valid date");
                                    }                                  
                                }
                                else
                                {
                                    System.out.println("This is not a leap year");
                                    if(m ==2)
                                    {
                                        if(d<29)
                                        {
                                            System.out.println("This is a valid Date");
                                        }
                                        else
                                        {
                                            System.out.println("Feb has only 28 days");
                                        }	
                                    }
                                    else
                                    {
                                        if(m==4 || m==6 || m ==9 || m==11)
                                        {
                                            if(d<=30)
                                            {
                                                System.out.println("The date is valid");
                                            }
                                            else
                                            {
                                                System.out.println("This month has only 30 days");
                                            }
                                        }
                                        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
                                        {
                                            if(d<=31)
                                            {
                                                System.out.println("The date is valid");
                                            }
                                            else
                                            {
                                                System.out.println("This month has only 31 days");
                                            }
                                        }
                                    }
                                }
                        }
                        else
                        {
                            System.out.println("Enter a valid day");
                        }	
                    }
                    else
                    {
                        System.out.println("Enter a valid month");
                    }
                }
                else
                {
                    System.out.println("Enter a Valid Year");
                }
            }
            else
            {
                System.out.println("Enter a valid Date");
            }
        }
        else
        {
            System.out.println("Enter a Valid Date Format");
        }
	}
}
