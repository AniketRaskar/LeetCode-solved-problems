#include<iostream>
using namespace std;

int main()
{
    int no =11;
    int  count=0;
    while(no)
    {
        if(no&1)
        {
            count++;
        }
        no = no>>1;
    }
    cout<<count;
}