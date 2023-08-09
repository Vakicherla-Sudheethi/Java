class ForNameEg
{
    
}
class Bow
{
public static void main(String args[]) throws Exception
{
    Class c = Class.forName("ForNameEg");
    System.out.println(c.getName());
}
}

//ForNameEg
