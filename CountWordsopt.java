public class CountWordsopt
{
    public static int count(String s)
    {
        int words = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(!Character.isWhitespace(ch) && (i == 0 || Character.isWhitespace(s.charAt(i - 1))))
            {
                words++;
            }
        }

        return words;
    }

    public static void main(String[] args)
    {
        String s = "   she   am   good   girl   ";
        System.out.println("Number of words: " + count(s));
    }
}