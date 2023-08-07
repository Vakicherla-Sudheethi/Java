class StringName
{
    public static void main(String args[])
    {
        Thread t = new Thread("Hello im thread");
        t.start();
        
        String s  = t.getName();
        System.out.println(s);
    }
    
}
