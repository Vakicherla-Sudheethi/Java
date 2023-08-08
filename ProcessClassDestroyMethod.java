class ProcessClassDestroyMethod
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Creating a process");
            Process p1 = Runtime.getRuntime().exec("notepad.exe");
            p1.destroy();
            System.out.println("Process Destoryed");
        }
        catch(Exception e)
        {
            System.out.println("Exception arised");
        }
    }
}
