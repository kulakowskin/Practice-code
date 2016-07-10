// Nicole Kulakowski
// Question 1.3

// Given two strings, write a method to decide if one is a permutation 
// of the other.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnePointThree{

	BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	String one, two;

	public static void main(String[] args){
		OnePointThree OPT = new OnePointThree();
		OPT.dothing();
	}

	private String sort(String s){
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	private boolean permutation(String s, String t){
		if(s.length() != t.length())
		{
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public void dothing()
	{
		try{

			one = br.readLine();
			two = br.readLine();

		} catch(IOException e){
			one = "error";
			two = "error";
		}
		System.out.println(permutation(one,two));
	}

}
