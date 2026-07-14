public class Palindrome
{
public static void palindrome(String s,String rev)
{
for(int i=s.length()-1;i>=0;i--)
{
rev +=s.charAt(i);
}
if(rev.equals(s))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
public static void main(String[] args)
{
String s="madam";
String rev="";
palindrome(s,rev);
}
}
 