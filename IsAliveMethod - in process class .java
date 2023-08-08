class IsAliveMethod
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("The Process is created");
            Process p = Runtime.getRuntime().exec("mspaint.exe");
            p.waitFor();
            System.out.println(p.isAlive());
            System.out.println("the process is alive");
            p.destroy();
            System.out.println(p.isAlive());
            System.out.println("The proces is dead");
        }
        catch(Exception e)
        {
            System.out.println("I'm exception"+e);
        }
    }
}
/*
The Process is created
true
the process is alive
false
The process is dead
*/
