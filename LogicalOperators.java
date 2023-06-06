class LogicalOperators
{
public static void main(String args[])
{
int a = 2;
System.out.println(a>1 && a<4);//true
System.out.println(a<1 && a<4);//false
System.out.println(a<1 || a<4);//True
System.out.println(a<1 || a>4);//False
System.out.println(!(a>1 && a<4));//False
}
}