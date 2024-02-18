package edu.sbcc.cs105;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DocStats {

private int numberOfLines;
private int numberOfCharacters;
private int numberOfWords;

public DocStats(String documentName)throws IOException {
	Path path = Paths.get(documentName);
	
	Scanner scan = new Scanner(path);
	
	//initialize
	
	numberOfLines = 0;
	numberOfCharacters = 0;
	numberOfWords = 0;
	
	//counting number of lines
	
	while(scan.hasNextLine()) {
		numberOfLines++;
		scan.nextLine();
	}
	
	scan.close();
	scan = new Scanner(path);
	
	//counting number of characters
	
	while(scan.hasNext()) {
		String word = scan.next();
		numberOfCharacters = numberOfCharacters + word.length();
		numberOfCharacters++;
		
		
	}
	
	//counting number of words
	scan.close();
	scan = new Scanner(path);
	
	while(scan.hasNext()) {
		numberOfWords++;
		scan.next();
	}
	scan.close();
}

//get num of char
public int getNumberOfCharacters() {
	return numberOfCharacters;
}
//get number of lines
public int getNumberOfLines() {
	return numberOfLines;
}
//get number of words
public int getNumberOfWords() {
	return numberOfWords;
}
	}

