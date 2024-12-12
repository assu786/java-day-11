interface A
{

}
class h implements A
{
    public void print()
    {
        System.out.println("hello");
    }
}
class B 
{
    public static void main(String args[])
    {
        h a=new h();
        a.print();
    }
}