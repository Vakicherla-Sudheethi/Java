class ThreadsRunnable implements Runnable
{
    public void run()
    {
           System.out.println("thread is running");
    }
}
class ThreadRunnable2
{
public static void main(String args[])
{
    ThreadsRunnable tr = new ThreadsRunnable();
    Thread t=new Thread(tr);
    t.start();
}
}
