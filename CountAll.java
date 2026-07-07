public class CountAll
{
public static void count(String s)
{
int alphabet=0;
int digit=0;
int special=0;

for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);

if(Character.isLetter(ch))
{
alphabet++;
}
else if(Character.isDigit(ch))
{
digit++;
}
else
{
special++;
}
}
System.out.println("alphabets : "+alphabet);
System.out.println("digits : "+digit);
System.out.println("specials : "+special);
}
public static void main(String[] args)
{
String s="Gowthu123@";
count(s);
}
}