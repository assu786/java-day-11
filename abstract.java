import java.util.*;
abstract interface math
{
    void print();
}
class d implements math
{
    public void print()
    {
        System.out.println("hello students");
    }
}
class a
{
    public static void main(String args[])
    {
    d b=new d();
    b.print();
    }
}