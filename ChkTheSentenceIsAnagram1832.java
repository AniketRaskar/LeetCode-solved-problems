import java.util.HashMap;

public class ChkTheSentenceIsAnagram1832 
{
    public static void main(String[] args) 
    {
       String sent = "thequickbrownfoxjumpsoverthelazydog";
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch='a';ch<='z';ch++)
       {
            map.put(ch, 0);
       }
       for(int i=0;i<sent.length();i++)
       {
            int freq = map.get(sent.charAt(i));
            map.put(sent.charAt(i), freq+1);
       }
       for(char c: map.keySet())
       {
            int iCnt = map.get(c);
            if(iCnt==0) return false;
       }
       return true;
    }
}
