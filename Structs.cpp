#include <iostream>
#include <cstring>
using namespace std;

//Compiler version g++ 6.3.0

struct hacker
{
  int age ;
  string name ;
  string last_name ;
  int standard ;
};

int main()
{
  struct hacker p1;
  cin >> p1.age ;
  cin >> p1.name ;
  cin >> p1.last_name ;
  cin >> p1.standard ;
  
  cout << p1.age << " ";
  cout << p1.name << " ";
  cout << p1.last_name << " ";
  cout << p1.standard << endl ;
 return 0;
}
