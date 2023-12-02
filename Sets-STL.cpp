#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <set>
#include <vector>
using namespace std;

int main() {
  int n, a, x, i;
  set<int> s; //set to store unique integers
  cin >> n;
  for (i = 0; i < n; i++) {
    cin >> a >> x;
    cin.ignore();
    if (a == 1) {
      s.insert(x);
    }
    if (a == 2) {
      s.erase(x);
    }
    if (a == 3) {
      set<int>::iterator pos;
      pos = s.find(x);
      if (pos == s.end()) {
        cout << "No" << endl;
      } else {
        cout << "Yes" << endl;
      }
    }
  }
  return 0;
}
