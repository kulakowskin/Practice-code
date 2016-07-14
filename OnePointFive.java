// Nicole Kulakowski
// Question 1.5

// Implement a method to perform basic string compression 
// using the counts of repeated characters. For example, 
// the string aabcccccaaa would become a2b1c5a3. If the 
// "compressed" string would not become smaller than the 
// original string, your method should return the original 
// string.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OnePointFive{
	
	private String input;
	private BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	private ArrayList<String> finalString = new ArrayList<String>();

	public static void main(String[] args){
		OnePointFive opf = new OnePointFive();
		System.out.print("Enter string:\t");
		opf.parseString();
	}

	public void parseString(){
		try{

			input = br.readLine();
			input+="\0";
			System.out.println(input);
			char currentChar = '\0';
			int currentCount = 1;
			int idxFinal = 0;

			for(int i = 0; i<input.length(); i++){

				// if the next char will be different
				if( i != 0 && input.charAt(i) != currentChar){
					idxFinal++;
				}

				// if current is equal to previous
				if (currentChar == input.charAt(i)){
					currentCount++;
				}
				// new character
				else{
					currentCount = 1;
					currentChar = input.charAt(i);
				}
				
				try{
					finalString.set(idxFinal, currentChar+Integer.toString(currentCount));	
				} catch(IndexOutOfBoundsException e){
					finalString.add(idxFinal, currentChar+Integer.toString(currentCount));
				}

			}

			for(int i = 0; i<finalString.size()-1 ; i++){
				System.out.print(finalString.get(i));
			}
	
			System.out.println();

		} catch(IOException e){
			System.out.println("readLine failed");
		}
	}

}