// Nicole Kulakowski
// Question 1.3

// Given two strings, write a method to decide if one is a permutation 
// of the other.

//#include "string"

#include <iostream>
#include <algorithm>


using namespace std;


bool sorting(string one, string two){
	if(one.length() != two.length()){
		return false;
	}
	sort(one[0], one[(one.length()/8)]);
	sort(two[0], two[(two.length()/8)]);
	if (one == two)
	{
		return true;
	}
	else{
		return false;
	}
}

int main(int argc, char const *argv[])
{
	string one, two;
	cin>>one>>two;
	
	cout<<sorting(one, two);

	return 0;
}