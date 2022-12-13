#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int x=0;
    cin>>x;
    
        int no =x;
        int digit=0,ans=0;
        while(no)
        {
            digit = no %10;
            if((ans>(INT_MAX)/10) || (ans<(INT_MIN)/10))
            {
                return 0;
            }
            ans = ans * 10 + digit;
            no = no/10;
        }
        cout<<ans;
    return 0;
}