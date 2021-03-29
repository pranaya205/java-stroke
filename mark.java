class mark
{
public static void main(String a[])
{
int telugu,hindi,english;
float total,average,highest;
System.out.println("enter the three subjects marks");
telugu=65;
hindi=88;
english=70;
total=telugu+hindi+english;
if(telugu>hindi&&telugu>english)
{
System.out.println(" highest marks="+telugu);
}
else if(hindi>telugu&&hindi>english)
{
System.out.println(" highest marks="+hindi);
}
else 
System.out.println("highest marks="+english);
average=total/3;
System.out.println("total marks="+total);
System.out.println(" average marks="+average);
}
}

