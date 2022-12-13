#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int x =0;
    cin>>x;
    /*
    int i=0;
    while(i<31)
    {
        if(x==pow(2,i))
        {
            return true;
        }
        else
        {
            return false;
        }
        i++;
    }
    */
   int ans =1;
   for(int i=1;i<31;i++)
   {
    if(ans  == x)
    {
        return true;;
    }
    ans = ans *  2;

   }

    return 0;
}