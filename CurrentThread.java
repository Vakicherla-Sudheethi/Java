class Bow extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        Bow t1 = new Bow();
        Bow t2 = new Bow();
        t1.start();
        t2.start();
    }
}
