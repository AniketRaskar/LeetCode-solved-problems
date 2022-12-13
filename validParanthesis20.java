import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

class validParanthesis20
{
    public static void main(String[] args) 
    {
      String str = "()[]{}";
      Stack<Character> s= new Stack<>();
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
        {
          s.push(str.charAt(i));
        }
        else if(s.empty())
        {
          return false;
        }
        else if(str.charAt(i)==')')
        {
          if(s.peek()=='(')
          {
            s.pop();
          }
          else
          {
            s.push(')');
          }
        }
        else if(str.charAt(i)=='}')
        {
          if(s.peek()=='{')
          {
            s.pop();
          }
          else
          {
            s.push('}');
          }
        }
        else if(str.charAt(i)==']')
        {
          if(s.peek()=='[')
          {
            s.pop();
          }
          else
          {
            s.push(']');
          }
        }
      }
      if(!s.empty())
      {
        return false;
      }
      return true;
    }
}