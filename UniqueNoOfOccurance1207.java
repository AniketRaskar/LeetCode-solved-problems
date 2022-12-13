import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.*;

import javax.swing.event.SwingPropertyChangeSupport;

class UniqueNoOfOccurance1207
{
    public static void main(String[] args) 
    {
        int Arr[] ={1,3,2,1,2,3,2,3,3};
        HashMap <Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<Arr.length;i++)
        {
            if(map.containsKey(Arr[i]))
            {
                count = map.get(Arr[i]);
                map.put(Arr[i],count+1);
            }
            else
            {
                map.put(Arr[i],1);
            }
        }  

        System.out.println(map);
        
        /*
        1 = 2
        2 = 3
        3 = 4
        
        */
        HashSet<Integer> set=new HashSet<Integer>(); 
        
         for(int no : map.keySet())
        {
            int value = map.get(no);

            if(set.contains(value))
            {
                return false;
            }
            else
            {
                set.add(value);
            }
        }  
        /*map.forEach(K,V)
        {
            if(set.contains(no))
            {
                return false;
            }
        }*/  

        return true;
    }
    
}