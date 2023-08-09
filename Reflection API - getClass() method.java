class GetClassMethod
{
}
class Bow
{
    public void bowbow(Object obj)
    {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }
    public static void main(String args[])
    {
        GetClassMethod g =new GetClassMethod();
        Bow b = new Bow();
        b.bowbow(g);
    }
}

/*
java -cp /tmp/fxD73bWpyQ Bow
GetClassMethod
*/

