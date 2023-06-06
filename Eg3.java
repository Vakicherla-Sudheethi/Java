//Square root of given numb
import java.util.*;
import java.util.Scanner;
class Eg3{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number: ");
int sq_num = sc.nextInt();
System.out.println("Enter the power value :");
int pow = sc.nextInt();
System.out.println(Math.pow(sq_num,pow));
}
}
/*
Enter a number:
2
Enter the power value :
2
4.0
*/
