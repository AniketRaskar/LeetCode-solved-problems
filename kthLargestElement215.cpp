#include <iostream>
#include <bits/stdc++.h>;
using namespace std;

class Solution {
public:
    void findKthLargest(vector<int>& nums, int k) 
    {
        priority_queue<int> g;
        for(int i:nums)
        {
            g.push(i);
        }
        k--;
        while (k!=0) {
        g.pop();
        k--;
        }
        cout<<g.top();
    }
};
int main()
{
    Solution obj;
    vector <int> v= {3,2,1,5,6,4};
    int k=2;
    obj.findKthLargest(v,k);
    return 0;
}