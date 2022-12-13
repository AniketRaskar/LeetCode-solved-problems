import java.lang.*;
import java.util.ArrayList;
class StringMatchingInArray
{
    public static void main(String[] args) 
    {
        String[] words = {"mass","as","hero","superhero"}; 
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i].length()>words[j].length())
                {
                    continue;
                }
                if(words[j].contains(words[i]))
                {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;

    }
}