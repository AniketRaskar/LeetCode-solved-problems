import java.util.Stack;

class RemoveAdjecantDup1047
{
    public static void main(String[] args) 
    {
        String str ="abbaca";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(!s.empty() && s.peek()==str.charAt(i))
            {
                s.pop();
            }
            else
            {
                s.add(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!s.empty())
        {
            sb.append(s.pop());
        }
        return sb.reverse().toString();

        

        
    }
}