import java.util.HashMap;

import java.util.*;
public class IsomorphicStrings209 
{
    public static void main(String[] args) 
    {
        String s = "add";
        String t = "egg";
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> word_set = new HashSet<Character>();;
        Set<Character> pattern_set = new HashSet<Character>();
        char[] str = s.toCharArray();
        char[] ttr= t.toCharArray();
        for (Character word: str) word_set.add(word);
        for (char c: t.toCharArray()) pattern_set.add(c);
        //if(pattern.length() != s.length()) return false;
        if (str.length != t.length() || word_set.size() != pattern_set.size()) return false;
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
            else map.put(s.charAt(i),t.charAt(i));
        }

    }
}
