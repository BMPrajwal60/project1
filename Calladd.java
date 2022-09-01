// Added comment
import java.util.Scanner;
public class Calladd
{
public static void main(String args[])
{
float a,b,res;
char chioce,ch;
Scanner scan = new Scanner(System.in);

do
{
System.out.println("1.  add two Numbers");
System.out.println("2.  exit");
System.out.println("Enter the chioce");
chioce = scan.next().charAt(0);
switch(chioce)
{
case'1'  : System.out.println("Enter the two numbers:");
           a= scan.nextFloat();
           b= scan.nextFloat();
           res=a+b;
           System.out.println("Result="+res);
           break;
case'2'  : System.exit(0);
           break;

default  : System.out.println("Invaild Choice");
           break;
}
System.out.print("\n-----------------------------------\n");

}
while(chioce!=2);
}
}
