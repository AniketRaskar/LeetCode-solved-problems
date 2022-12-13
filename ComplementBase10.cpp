#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int x =0;
    cin>> x;
    if(x==0)
    {
        return 1;
    }
    int no =x,mask =0,ans =0;
    while(no)
    {
        mask = (mask<<1) | 1;
        no = no >> 1;
    }
    ans = (~x) & mask;    cout<<ans;
    return 0;
}