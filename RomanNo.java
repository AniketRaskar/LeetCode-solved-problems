import java.lang.*;
import java.util.HashMap;
import java.util.*;

class SolutionX {
    String str ;
    public SolutionX(String S)
    {
        this.str= S;
    }
    public int romanToInt() 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char Arr[]= str.toCharArray();
        int sum=0;
       
        sum = map.get(Arr[Arr.length-1]);
        for(int i= Arr.length-2;i>0;i--)
        {
            if(map.get(Arr[i])<map.get(Arr[i+1]))   //MCMXCIV
            {
                sum -= map.get(Arr[i]);
            }
            else
            {
                sum += map.get(Arr[i]);
            }
        }
        if(Arr.length>1)
        {
            if(map.get(Arr[0])>=map.get(Arr[1]))
            {
                sum += map.get(Arr[0]);
            }
            else
            {
                sum -= map.get(Arr[0]);
            }
        }
        

        return sum;
        
    }
}
public class RomanNo 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        String s = sobj.nextLine();
        
        SolutionX robj = new SolutionX(s); 

        int iRet = robj.romanToInt();
        System.out.println(iRet);
    }  
}
