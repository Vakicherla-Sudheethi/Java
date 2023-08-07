class Bow implements Runnable
{
    public void run()
    {
        System.out.println("Running method");
    }
}
class Bow2
{
    public static void main(String args[])
    {
        Bow b = new Bow();
        Thread t1 = new Thread(b,"Hello i'm thread 1");
        t1.start();
        
        String s = t1.getName();
        System.out.println(s);
    }
}
