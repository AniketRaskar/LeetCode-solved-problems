import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class PowerOf3_326 {
   public static void main(String[] args) 
   {
     int n=27;
     if(n<0) return false;
     while(n>1)
     {
        if(n%3==0)
        {
            n = n/3;
        }
        else 
        {
            return false;
        }
     }
     if(n==1)return true;
     else return false;
   } 
}
