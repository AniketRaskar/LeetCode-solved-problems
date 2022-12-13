class MaxNoOfVovelInSubtring1456
{
    public static void main(String[] args) 
    {
       String s = "abciiidef";
       int k =3;
       int max =0;
       for(int i=0;i<s.length()-k;i++)
       {
        int iCnt =0;
            for(int j=i;j<i+k;j++)
            {
                char c = s.charAt(j);
                if(c == 'a'|| c=='e'||c=='i'||c=='o'||c=='u')
                {
                    iCnt++;
                }
            }
            if(iCnt>max)
            {
                max = iCnt;
            }
       }
    }
}