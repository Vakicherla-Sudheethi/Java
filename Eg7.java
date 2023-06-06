import java.util.*;
import java.util.Scanner;
class Eg7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num: ");
int n = sc.nextInt();
if (n % 2 == 0)
{
System.out.println("num is even");
}
else
{
System.out.println("num is odd");
}
}
}
/*
Enter a num:
2
num is even

C:\Users\fluff\OneDrive\Desktop\Java>java Eg7
Enter a num:
5
num is odd
*/