#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

vector < string > Hello(string str) {
  vector < string > vv;
  string c;
  stringstream ss(str);
  while (getline(ss, c, ',')) {
    vv.push_back(c);
  }
  return vv;
}
int main() {
  string str;
  cin >> str;

  vector < string > v = Hello(str);
  for (int i = 0; i < v.size(); i++) {
    cout << v.at(i) << endl;
  }
  return 0;
}
