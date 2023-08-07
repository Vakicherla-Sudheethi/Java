class NewThread extends Thread
{
    public void run()
    {
        System.out.println("running");
    }
}
class NewThread2
{
    public static void main(String args[])
    {
        NewThread nt= new NewThread();
        nt.start();
    }
}
