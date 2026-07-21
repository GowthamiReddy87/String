public class CountWords3
{
public static int count(String s)
{
int words=1;
int wh=0;
for(int i=0;i<s.length();i++)
{
char th=s.charAt(i);
if(Character.isWhitespace(th))
{
wh++;
}
}
if(wh==0)
{
return 1;
}
for(int i=1;i<s.length();i++)
{
char ch=s.charAt(i);
char sh=s.charAt(i-1);
if(Character.isLetter(ch))
{
if(Character.isWhitespace(sh))
{
words++;
}
}
}
return words;
}
public static void main(String[] args)
{
String s="she am good girl";
System.out.println(count(s));
}
}