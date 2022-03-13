package maths;

public class Maths
{
    public int a, b;

    public Maths(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    public int add()
    {
        return (a+b);
    }
     
    public int sub()
    {
        return (a-b);
    } 

    public int mult()
    {
        return (a*b);
    }

    public int div()
    {
        return (a/b);
    }
}