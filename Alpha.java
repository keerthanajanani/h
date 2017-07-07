# h
import java.io.*;
import java.util.*;
public class Alpha
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c;
System.out.println("Enter the Character:");
n=Integer.parseInt(br.readLine());
if((c>='a' && c<='z') || (c>='A' && c<='Z'))
{
System.out.println(c +" is Alphabet");
}
else
{
System.out.println(c +" is not an Alphabet");
}
}
}
