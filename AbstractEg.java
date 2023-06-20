//Abstract class
abstract class AbstractEg
{
public int x = 14;
public int y = 23;
public abstract void students();//abstract method
}
class Eg2 extends AbstractEg
{
public int Gradyear = 2023;
public void students()
{
System.out.println("STUDENTS OF CSE");
}
}
class Eg3{
public static void main(String args[])
{
Eg2 obj = new Eg2();
System.out.println("1st student " + obj.x);
System.out.println("2nd student " +obj.y);
System.out.println("Grad year " +obj.Gradyear);
obj.students();
}
}