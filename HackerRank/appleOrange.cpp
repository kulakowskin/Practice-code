// Taken from HackerRank -
// See https://www.hackerrank.com/challenges/apple-and-orange/problem
//
// Nicole Kulakowski 12/10/2017


#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

long apples(vector<long> apple, long s,long t,long a){
    long count = 0;
    long distR = s - a;
    long distL = distR + (t - s);
    for(long i = 0; i<apple.size(); i++){
        if(apple[i]>=distR && apple[i]<=distL){
            count++;
        }
    }
    return count;
}

long oranges(vector<long> orange, long t,long s,long b){
    long count = 0;
    long dist = t - b;
    long total = dist + (s-t);
    for(long i = 0; i<orange.size(); i++){
        if(orange[i]<=dist && orange[i]>=total){
            count++;
        }
    }
    return count;
}


int main(){
    long s;
    long t;
    cin >> s >> t;
    long a;
    long b;
    cin >> a >> b;
    long m;
    long n;
    cin >> m >> n;
    vector<long> apple(m);
    for(long apple_i = 0;apple_i < m;apple_i++){
       cin >> apple[apple_i];
    }
    vector<long> orange(n);
    for(long orange_i = 0;orange_i < n;orange_i++){
       cin >> orange[orange_i];
    }

    cout<<apples(apple,s,t,a)<<endl;
    cout<<oranges(orange,t,s,b)<<endl;
    return 0;
}
