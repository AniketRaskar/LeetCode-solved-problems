import java.util.*;;

public class WordPattern290
{
  public static void main(String[] args) 
  {
    String pattern ="abba";
    String s = "dog dog dog dog";
    HashMap<Character,String> map = new HashMap<>();
    String[] str = s.split(" ");
    Set<String> word_set = new HashSet<String>();;
    Set<Character> pattern_set = new HashSet<Character>();
    for (String word: str) word_set.add(word);
    for (char c: pattern.toCharArray()) pattern_set.add(c);
    //if(pattern.length() != s.length()) return false;
    if (str.length != pattern.length() || word_set.size() != pattern_set.size()) return false;

    for(int i=0;i<str.length;i++)
    {
     if(map.containsKey(pattern.charAt(i)))
     {
      if(map.get(pattern.charAt(i)).equals(str[i])) continue;
      else return false;
     }
     else
     {
      map.put(pattern.charAt(i),str[i]);
     }
    }
   return true;
  }  
}
