class largest
{
public static void main(String a[])
{
int n1=Integer.parseInt(a[0]);
int n2=Integer.parseInt(a[1]);
int n3=Integer.parseInt(a[2]);
if(n1>n2&&n1>n3)
{
System.out.println("print the result is ="+n1);
}
else if(n2>n1&&n2>n3)
{
System.out.println("print the result is ="+n2);
}
else
System.out.println("print the result is ="+n3);
}
}