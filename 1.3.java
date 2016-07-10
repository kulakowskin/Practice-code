// Nicole Kulakowski
// Question 1.3

// Given two strings, write a method to decide if one is a permutation 
// of the other.

public class OnePointThree{

	public static void main(String[] args){
		String[] strings;
		int i = 0;

		while((strings[i] = System.in.read()) !="\n")
		{
			i++;
		}

		System.out.println(strings[0]);
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

}
