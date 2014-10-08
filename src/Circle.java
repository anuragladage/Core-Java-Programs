package mylib.geoshapes;

import mylib.geoshapes.NegativeRadiusNotAcceptedException;


public class Circle
{

    int radius;
    float area;

    public Circle()
    {
        radius = 0;
        area = 0.0f;
    }

    public Circle(int radius)
    {
        this.radius = radius;
        area = (float) (Math.PI*radius*radius);
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius) throws NegativeRadiusNotAcceptedException
    {
        if(radius<0)
        {
            NegativeRadiusNotAcceptedException e;
            e = new NegativeRadiusNotAcceptedException("" + radius);
            throw e;
        }
        else
        {
            this.radius =radius;
            area = (float)(Math.PI*radius*radius);
        }
    }
    
    public boolean equals(Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        
        if(obj instanceof Circle)
        {
            if(radius==((Circle)obj).radius)
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
            return false;
        }
    }
    
    public int hashCode()
    {
        return radius/10;
    }
    
    public String toString()
    {
        return ("Circle - Radius : " + radius + ". Area : " + area);
    }


    public float getArea()
    {
        
        return area;
    }
    
    
}