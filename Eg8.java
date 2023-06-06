import java.util.*;
import java.util.Scanner;
class Eg8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a year: ");
int year = sc.nextInt();
if(year % 4 == 0)
{
if(year % 100 == 0)
{
if(year % 400 == 0)
{
System.out.println("leap year");
}
System.out.println("not a leap year");
}
System.out.println("leap year");
}
}
}
