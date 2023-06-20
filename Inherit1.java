// inheritance
class Inherit1 
{
String name = "Kanna";
}
class Bannu extends Inherit1
{
int rollnum = 7;
public static void main(String args[])
{
Bannu b= new Bannu();
System.out.println(b.name);
System.out.println(b.rollnum);
}
}