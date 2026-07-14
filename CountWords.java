public class CountWords
{
public static void count(String s)
{
int words=1;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);

if(Character.isWhitespace(ch))
{
words++;
}
}
System.out.println("No of words : "+words);
}
public static void main(String[] args)
{
String s="i am good girl";
count(s);
}
}