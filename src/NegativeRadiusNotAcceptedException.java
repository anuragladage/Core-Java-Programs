package mylib.geoshapes;

public class NegativeRadiusNotAcceptedException extends Exception
{
    public NegativeRadiusNotAcceptedException()
    {
        super("Radius is negative");
    }
    public NegativeRadiusNotAcceptedException(String msg)
    {
        super(msg);
    }
}