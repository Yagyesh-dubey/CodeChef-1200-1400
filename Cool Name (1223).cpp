#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        sort(s.begin(),s.end());

        int sum=0;
        for(int i=0;i<s.size();i++)
        {
            sum+=(i+1)*((int)s[i]-96);
        }
        cout<<sum<<endl;
        
    }
	// your code goes here
	return 0;
}
