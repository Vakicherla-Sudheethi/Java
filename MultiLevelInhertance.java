class MultiLevelInhertance
{
void eat()
{
System.out.println("eating");
}
}
class Two extends MultiLevelInhertance
{
void jump()
{
System.out.println("jumping");
}
}
class Three extends Two
{
void crave()
{
System.out.println("Craving");
}
}
class Test
{
public static void main(String args[])
{
Three t = new Three();
t.crave();
t.jump();
t.eat();
}
}
/*o/p:
Craving
jumping
eating
*/