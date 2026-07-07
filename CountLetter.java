public class CountLetter
{
public static void count(String s)
{
int upper=0;
int lower=0;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);

if(ch >= 'A' && ch <= 'Z')
{
upper++;
}
else 
{
lower++;
}
}
System.out.println("Upper case letters : "+upper);
System.out.println("lower case letters : "+lower);
}
public static void main(String[] args)
{
String s="Hello";
count(s);
}
}