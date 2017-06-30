import java.io.*;
import java.util.Scanner;
class Alphaabet
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch=sc.next();
if((ch>=a && ch<=z) || (ch>=A && ch<=Z))
{
System.out.println(ch+ "is an Alphabet");
}
else
{
System.out.println(ch+ "is not an Alphabet");
}
}
}
