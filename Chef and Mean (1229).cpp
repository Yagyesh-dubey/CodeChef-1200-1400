 #include <bits/stdc++.h>
using namespace std;
#define ll long long
#define mod 1000000007
#define  N 1000000 
void distinctprimefactors(ll a[])
{
    for(ll i=2;i<=N;i++){
        if(a[i]==0)
        {
            for(ll j=i;j<=N;j=j+i)
            {
                a[j]++;
            }
        }
    }
}
int gcd(ll a,ll b)
{
    if(b==0){
        return a;
    }
    else {
        gcd(a,a%b);
    }
}
bool isPrime(int n)
{
    // Corner case
    if (n <= 1)
        return false;
 
    // Check from 2 to square root of n
    for (int i = 2; i <= sqrt(n); i++)
        if (n % i == 0)
            return false;
 
    return true;
}

/* Iterative Function to calculate (x^y)%p in O(log y) */
int modularexponentiation(long long x, unsigned int y, int p)
{
    int res = 1;     // Initialize result
 
    x = x % p; // Update x if it is more than or
                // equal to p
  
    if (x == 0) return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
        // If y is odd, multiply x with result
        if (y & 1)
            res = (res*x) % p;
 
        // y must be even now
        y = y>>1; // y = y/2
        x = (x*x) % p;
    }
    return res;
}
int main() {
	// your code goes here
	ll t;
	cin>>t;
	while(t--){
	   ll n;
	   cin>>n;
	   ll a[n];
	   ll sum=0,ans=0;
	   for(ll i=0;i<n;i++){
	       cin>>a[i];
	       sum+=a[i];
	   }
	   ll mean=sum/n;
	   if(sum%n!=0){
	       cout<<"Impossible"<<endl;
	   }
	   else{
	   for(ll i=0;i<n;i++){
	       if(a[i]==mean){
	           ans=i+1;
	            cout<<ans<<endl;
	           break;
	       }
	   }
	   if(!ans)
	    cout<<"Impossible"<<endl;
	}
	}
	
	return 0;
}
