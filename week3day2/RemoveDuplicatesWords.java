package week3day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Declare all variables
		String sentence, result = "";
		String allWords[];
		
		Scanner sc = new Scanner(System.in);
		// Accept any sentence from User 
		System.out.print("Enter your sentence: "); 
		sentence = sc.nextLine().toLowerCase();  //convert to lower case
		
		// Split the given sentence to get each word as String array
		allWords = sentence.split(" ");
		
		// Convert String Array allWords to LinkedHashSet to remove duplicates
        LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(allWords) );
        
		// Convert to String
		for(String word: set) {
			result = result + word + " ";
		}
		// Display given String after removing duplicates
		System.out.println("Sentence after removing duplicate words: " + result);

	}

}
