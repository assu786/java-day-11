import java.util.*;
interface out
{
    void outm();
    interface in
     {
        void innm();
     }
}
class d implements out.in
{
    public void innm()
    {
        System.out.println("hello i'm inner method");
    }
    public static void main(String args[])
    {
    d b=new d();
    b.innm();
    }
}