#include<iostream>
#include <bits/stdc++.h>
using namespace std;
 vector<int> searchRange(vector<int>& Arr, int l,int t) 
    {
    vector<int> Brr(2,-1);
    int size =Arr.size();
        if(size==0)
        {
            return Brr;
        }
    int f=-1,s=-1;
    for(int i=0;i<size;i++)
    {
        if(Arr[i]==t)
        {
            if(s==-1)
            {
                f=i;
                s=i;
                cout<<f<<" "<<s<<endl;
            }
            else
            {
                if(i>s)
                {
                    f=s;
                    s=i;
                }
            }
        }
        cout<<Brr[0]<<" "<<Brr[1]<<endl;
    }
        Brr[0]=f;
        Brr[1]=s;
        cout<<f<<" "<<s<<endl;
    return Brr;    
}
int main()
{
    vector <int> Arr ={1,2,3,4,4,5};
    int t =4;
    int len=Arr.size();
    int ret=searchRange(Arr,len,t);
    
}