import java.util.*;
class D 
{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(90);
        a.add(78);
        a.add(87);
        int l=0;
        int r=a.size()-1;
        while(l<r)
        {
            int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
    }
}