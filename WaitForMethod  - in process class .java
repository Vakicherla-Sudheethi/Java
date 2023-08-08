class WaitForMethod
{
    public static void main(String args[])
    {
     try
     {
         System.out.println("the Process is created");
         Process p = Runtime.getRuntime().exec("notepad.exe");
         p.waitFor();
         System.out.println("The waiting timee!!!");
         System.out.println("Note pad is exited");
         System.out.println("Running ms paint");
         Process p1 = Runtime.getRuntime().exec("mspaint.exe");
         p1.waitFor();
         System.out.println("The waiting timee!!!");
         System.out.println("MS paint is exited");
     }
     catch(Exception e)
     {
         System.out.println("i'm execption");
     }
    }
}
/*
the Process is created
The waiting time!!!
Note pad is exited
Running ms paint
The waiting time!!!
MS paint is exited

*/
