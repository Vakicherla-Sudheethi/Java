class MulDimArrLoop
{
public static void main(String args[])
{
int[][] num = { { 3,2,1} , {6,4,3} };
for ( int i=0;i<num.length;i++)
{
for(int j = 0 ;j<num[i].length;j++)
{
System.out.println(num[i][j]);
}
}
}
}