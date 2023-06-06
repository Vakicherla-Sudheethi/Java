//Given number is positive , negative or zero
import java.util.*;
import java.util.Scanner;
class Eg6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num: ");
int num = sc.nextInt();
if(num>0){
System.out.println("The numb is positive");
}
else if(num<0){
System.out.println("num is negitive");
}
else{
System.out.println("the number is zero");
}
}
}
/*
Enter a num:
12
The numb is positive

C:\Users\fluff\OneDrive\Desktop\Java>java Eg6
Enter a num:
-23
num is negitive

C:\Users\fluff\OneDrive\Desktop\Java>java Eg6
Enter a num:
0
the number is zero
*/

