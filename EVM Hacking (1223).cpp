#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes 
	int t;
	cin>>t;
	while(t--){
	    int a,b,c,p,q,r,max;
	    cin>>a>>b>>c>>p>>q>>r;
	    float s=float(p+q+r)/2;
	    if(p+b+c>s||a+q+c>s||a+b+r>s||a+b+c>s){
	        cout<<"Yes"<<endl;
	    }
	    else{
	        cout<<"No"<<endl;
	    }
	}
	return 0;
}
