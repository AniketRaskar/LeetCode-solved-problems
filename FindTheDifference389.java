public class FindTheDifference389 
{
 public static void main(String[] args) 
 {
    String s = "abcd", t = "abcde";
    char c=0;
    for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
 }   
}
