//Ternary operators
import java.util.*;
import java.util.Scanner;
class Ter
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
String res = (age < 18) ? " no Vote" : " vote";
System.out.println(res);
}
}