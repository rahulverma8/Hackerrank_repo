#include <iostream>
#include <vector>
#include <iterator>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
     vector<int> v;
    int N,p,x,a,b;
    cin>> N ;
    for(auto i=0;i<N;i++)
    {
      cin>> p;
      v.push_back(p) ;
    }
   cin>> x;
   v.erase(v.begin()+(x-1)) ;
   
   cin>> a >> b ;
   v.erase(v.begin()+(a-1),v.begin()+(b-1)) ;
   
   
   cout << v.size() << endl;
   for(auto i=v.begin();i<v.end();i++)
   {
     cout << *i << " ";
   }
 return 0;
}
