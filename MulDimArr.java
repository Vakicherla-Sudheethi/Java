class MulDimArr
{
public static void main(String args[])
{
int[][] roll = { {38,59,54} , {32,59,43}};
System.out.println(roll[1][2]);//43
roll[1][2] = 36;
System.out.println(roll[1][2]);//36
}
}