//If Statements eg -1
import java.util.*;
import java.util.Scanner;
class Eg{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if ( age >=18){
System.out.println("You Can Vote");
}
else{
System.out.println("Not allowed to vote");
}
}
}
/*C:\Users\fluff\OneDrive\Desktop\Java>java Eg
21
You Can Vote

C:\Users\fluff\OneDrive\Desktop\Java>java Eg
17
Not allowed to vote*/