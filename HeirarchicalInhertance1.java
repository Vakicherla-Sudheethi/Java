class HeirarchicalInhertance1
{
void bow()
{
System.out.println("Bow bow");
}
}
class Two extends HeirarchicalInhertance1
{
void meow()
{
System.out.println("meowwwww");
}
}
class Three extends HeirarchicalInhertance1
{
void quack()
{
System.out.println("quackkkkkkkkk");
}
}
class Test
{
public static void main(String args[])
{
Three t = new Three();
t.quack();
t.bow();
}
}
/*
o/p:

*/