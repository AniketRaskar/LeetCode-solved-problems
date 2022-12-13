#include <iostream>
using namespace std;


int main()
{
    int A[]={1,2,3,4,3,2};
    int s =0;
    int e = A.size();
    int m = s+(e-s)/2;

    while(s<e)
    {
        if(A[m]<A[m+1])
        {
            s = m+1;
        }
        else
        {
            e =m;
        }
        m= s+(e-s)/2;
    }
    return s;


    return 0;
}