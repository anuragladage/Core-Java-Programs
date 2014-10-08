package mylib.geoshapes;

public class Square
{
    int length;
    float area;
    
    
    public Square()
    {
        length = 0;
        area = 0.0f;
    }
    
    public Square(int length)
    {
        this.length = length;
        area = (float)(length*length);
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getArea()
    {
        area = length*length;
        return area;
    }
    
    
}