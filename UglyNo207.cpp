#include<iostream>
using namespace std;


boolean UglyNo(int no)
{
    for(int i=2;i<=(no/2);i++)
    {
       
        if((no%i)==0)
        {
            
            for(int j=2;j<=(i/2);j++)
            {
                if(((i%j)==0)&&(i>5))
                {
                   return false;
                    
                }

            }
            
        }
    }
    return true ;
}
int main()
{
    int n=0;


}