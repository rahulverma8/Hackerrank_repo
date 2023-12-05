#include <iostream>
using namespace std;

int main()
{
int n,Max=-1,count=0;
cin >> n;
int a[n];

for(int i=0;i<n;++i){
 cin >> a[i];
    
  if(Max<a[i])
  Max = a[i];
 }
 
for(int i=0;i<n;++i){
if(a[i]==Max)
++count;
}
    cout << count ;
}
