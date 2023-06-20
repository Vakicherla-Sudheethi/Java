class PublicStaticMethods
{
static void Bannu()
{
System.out.println("bannu");
}
public void Kanna()
{
System.out.println("kanna");
}
public static void main(String args[])
{
Bannu();//static method

//whenever you create a method as public then a new object should be 
//created.

PublicStaticMethods obj = new PublicStaticMethods();//object of main
obj.Kanna(); //calls the public method via object
}
}
