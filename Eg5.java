import java.util.*;
import java.util.Scanner;
class Eg5
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println("value of x is "+x);
int y = sc.nextInt();
System.out.println("value of y is "+y);
int temp;
temp=x;
x=y;
y=temp;
System.out.println("after swap x value is "+x);
System.out.println("after swap y value is "+y);
}
}
/*
2
value of x is 2
4
value of y is 4
after swap x value is 4
after swap y value is 2
*/
