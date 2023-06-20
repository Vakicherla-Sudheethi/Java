class SingleInheritance
{
void kanna()
{
System.out.println("kannalu");
}
}
class Bannu extends SingleInheritance
{
void bannu()
{
System.out.println("Bannlu");
}
}
class Test
{
public static void main(String args[])
{
Bannu b = new Bannu();
b.kanna();
b.bannu();
}
}
/*o/p:
kannalu
Bannlu
*/
