import java.io.File;
class ReadWriteAndExecuteToFile
{
public static void main(String args[])
{
File f  = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\6th Aug\\Global.txt");
if(f.exists())
{
System.out.println("Write: "+ f.canWrite());
System.out.println("Read: " +f.canRead());
System.out.println("Execute: "+f.canExecute());
}
else
{
System.out.println("File not found");
}
}
}