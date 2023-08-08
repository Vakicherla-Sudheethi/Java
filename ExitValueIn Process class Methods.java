public class Bow 
{  
public static void main(String[] args)
  {  
try
  {  
System.out.println("Let us create a new process");  
ProcessBuilder b3 = new ProcessBuilder("notepad.exe");  
Process p3= b3.start();  
System.out.println("Process is waiting");  
Thread.sleep(800);  
p3.destroy();  
System.out.println("Process is destroyed");  
System.out.println("Exit Value:"  +p3.exitValue());  
}  
catch(Exception e)
  {  
System.out.println(e);  
        }  
    }  
}  
