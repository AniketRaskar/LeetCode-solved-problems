import javax.lang.model.util.ElementScanner14;

public class RemoveDigitFromNoToMaxNo2259 
{
    public static void main(String[] args) 
    {
       String number = "1231";
       char digit = '3';
       int l=number.length();
        int last=number.lastIndexOf(digit);
        for(int i=0;i<l-1;i++){
            if(number.charAt(i)==digit && number.charAt(i+1)>number.charAt(i)){
                return number.substring(0,i)+number.substring(i+1);
            }
        }
        return number.substring(0,last)+number.substring(last+1);
    }
}
