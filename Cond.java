import java.util.*;
import java.util.Scanner;
class Cond
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
System.out.println(age);
if ( age >= 18){
System.out.println("You can vote");
}
else if ( age < 18){
System.out.println(" No you cannot vote");
}
else( age)
{
System.out.println("Hi ! Bye !");
}
}
}