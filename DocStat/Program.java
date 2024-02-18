package edu.sbcc.cs105;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException  {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter filename: ");

		String infilename = s.next();

		s.close();

		DocStats ds = new DocStats(infilename + ".txt");

		// DocStats ds = new DocStats("goblin.txt");

		System.out.printf("Number of characters: %d (expected 1450)\n", ds.getNumberOfCharacters());

		System.out.printf("Number of words: %d (expected 257)\n", ds.getNumberOfWords());

		System.out.printf("Number of lines: %d (expected 49)\n", ds.getNumberOfLines());

		}
		  
		
	}


