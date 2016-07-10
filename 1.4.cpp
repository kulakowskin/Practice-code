// Nicole Kulakowski
// Question 1.4

// Write a method to replace all spaces in a string with'%20'. You may assume that
// the string has sufficient space at the end of the string to hold the additional
// characters, and that you are given the "true" length of the string. (Note: if implementing
// in Java, please use a character array so that you can perform this operation
// in place.)

#include <iostream>
#include <string>

using namespace std;


int numberOfCharsInArray(char* array) {
       int numberOfChars = 0;
       for(int i = 0; i<sizeof(array)/sizeof(array[0]); i++) {
           numberOfChars++;
       }
       return numberOfChars;
 }

void change(char* input){

	int spaceCount = 0, newLength, oldLength;
	oldLength = numberOfCharsInArray(input);
	for (int i = 0; i < oldLength; ++i)
	{
		if (input[i] = ' ')
		{
			spaceCount++;
		}
	}
	newLength = oldLength + spaceCount*2;
	input[newLength] = '\0';
	cout<<oldLength<<endl;
	cout<<newLength<<endl;
	for (int i = oldLength; i >= 0; i--)
	{
		if (input[i] == ' ')
		{
			input[newLength-1] = '0';
			input[newLength-2] = '2';
			input[newLength-3] = '%';
			newLength = newLength - 3;
			//cout<<input[i]<<endl;
		}
		else{
			input[newLength-1] = input[i];
			newLength = newLength-1;
		}
	}
}


int main(int argc, char const *argv[])
{
	char str[] = "Hello my name is Nicole.\0";
	cout<<"before: "<<str<<endl;
	change(str);
	cout<<"after: "<<str<<endl;
	return 0;
}