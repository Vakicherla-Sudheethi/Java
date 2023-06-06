//Return Value
class MethodReturnValue
{
static void num(int x)
{
if(x>0){
System.out.println("Positive");
}
else if(x<0){
System.out.println("Negative");
}
else{
System.out.println("Zero");
}
}
public static void main(String args[])
{
num(12);//positive
}
}
