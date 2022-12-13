public class MinRecolorToGetKBlackBox1279 
{
    public static void main(String[] args) 
    {
       String s = "WBBWWBBWBW";
       int k =7;
       int iCnt =0;
        for(int i =0; i< k; i++)
            if(isBlack(s.charAt(i))) iCnt++;;
        int max = iCnt;
        for(int i = k; i < s.length(); i++){
            if(isBlack(s.charAt(i))) iCnt++;
            if(isBlack(s.charAt(i-k))) iCnt--;
            max = Math.max(max, iCnt);
        }
        //return max;
    }
    private boolean isBlack(char c){
        if(c == 'B') return true;
        return false;
    }   
}
