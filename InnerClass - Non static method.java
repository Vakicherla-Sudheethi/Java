class OuterClass
{
    int a;
    public void run()
    {
        System.out.println("hi i'm outerClass");
    }
    class InnerClass
    {
        public void bow()
        {
            System.out.println("Hi i'm inner class");
        }
    }
}
class BowBow{
public static void main(String args[])
{
    OuterClass o = new OuterClass();
    o.run();
    OuterClass.InnerClass i = o.new InnerClass();
    i.bow();
}
}

//hi i'm outerClass
//Hi i'm inner class
