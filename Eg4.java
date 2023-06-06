//Area of a traingle
/*
s=(a+b+c)/2
area=sqrt(s(s-a)*(s-b)*(s-c))
*/
import java.util.*;
import java.util.Scanner;
class Eg4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value: ");
int a = sc.nextInt();
System.out.println("Enter b value: ");
int b = sc.nextInt();
System.out.println("Enter c value: ");
int c = sc.nextInt();
int s;
s = (a+b+c)/2;
a = (s*(s-a)*(s-b)*(s-c));
System.out.println(Math.sqrt(a));
}
}
/*
Enter a value:
2
Enter b value:
2
Enter c value:
2
1.7320508075688772
*/
