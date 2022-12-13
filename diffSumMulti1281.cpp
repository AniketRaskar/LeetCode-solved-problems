#include<iostream>
using namespace std;
int main()
{
    int no=234;
    int t = no;
    int digit=0,sum=0,multi=1;
    while(t>0)
    {
        digit = t%10;
        multi *=digit;
        sum +=digit;
        t = t/10;
    }
    cout<<multi-sum<<endl;
    
    return 0;
}