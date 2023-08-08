import java.io.*;
class ReadFromFile
{
public static void main(String args[])
{
try
{
FileReader f = new FileReader("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\New folder\\Hello.txt");
try
{
int i ;
while((i = f.read())!= -1)
{
System.out.println(i);
}
}
finally
{ 
f.close();
}
System.out.println("Success");
}
catch(IOException e)
{
System.out.println("Exception raised");
}
}
}