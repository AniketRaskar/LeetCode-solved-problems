import java.lang.*;
import java.util.*;
public class CountingEleSmallerAndGreater2148
{
    public static void main()
    {
        int arr[] = {11,7,2,15};

        Arrays.sort(arr);

        int f=1,l=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]) f++;
            else break;
        }
        for(int j=arr.length;j>0;j--)
        {
            if(arr[j]==arr[j-1]) l++;
            else break;
        }

        return arr.length-(f+l);
    }
}
