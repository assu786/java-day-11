import java.util.*;
class d
{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(453);
        a.add(465);
        a.add(758);
        //adding at particular index
        a.add(1,546);
        //modifying
        a.set(2,6777);
        System.out.println(a);
    }
}