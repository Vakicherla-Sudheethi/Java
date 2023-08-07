class PriotityTypesInThreads extends Thread
{
public void run()
{
System.out.println("I'm inside run methods");
}
public static void main(String args[])
{
Thread t1 = new Thread();
Thread t2 = new Thread();
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
t1.setPriority(7);
t2.setPriority(4);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
}
}
