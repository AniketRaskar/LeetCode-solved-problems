#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector <int> s{2,7,3,1,8,1};
    //vector <int> s{1};

    
        sort(s.begin(),s.end());

        // cout<<"Sorted"<<endl;
        // for(int x : s)
        // {
        //     cout<<x<<" ";
        // }
        // cout<<endl;
        int size = s.size();
        //cout<<s.size();
        int x=0,y=0;
        while(size != 0)
        {
            sort(s.begin(),s.end());
            size = s.size();
            if(size==1)
            {
                //cout<<"Return stone is :"<<s[0]<<endl;
                return s[0];
            }
            else if(size == 0)
            {
                //cout<<0;

                return 0;
            }
            y = s[size-1];
            x = s[size-2];
            //cout<<y<<" "<<x<<endl;
            if(x==y)
            {
                s.erase(s.begin() +(size-1));
                s.erase(s.begin() +(size-2));
                size = size -2;
                //cout<<"Intise x=y";
                
            }
            else
            {
                
                 s.erase(s.begin() +(size-1));
                 s[size-2] = y-x;
                 size--;
            }
           // cout<<"Sorted"<<endl;
        // for(int x : s)
        // {
        //     cout<<x<<" ";
        // }
        // cout<<size<<endl;
            
        }
        
        
    
    return 0;
}