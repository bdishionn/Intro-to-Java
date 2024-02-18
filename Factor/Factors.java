package edu.sbcc.cs105;

import java.util.ArrayList;

public class Factors {
	// private attributes
	private ArrayList<Integer> factorList;
	private int factorIndex;

	// constructor
	public Factors(int n){
	//initialise factorIndex
	factorIndex = 0;

	// initialise list
	factorList = new ArrayList<Integer>();

	// calculte all 2 in factor of given number
	while(n%2 == 0){
	factorList.add(2);
	n = n/2;
	}
	  
	// now n will be odd so we can skip even numbers
	// start from i=3
	int i=3;
	  
	while(i<=(Math.sqrt(n))){
	// now calculate how many times i divide n
	while(n % i == 0){
	factorList.add(i);
	n = n/i;
	}
	i = i+2;
	}
	  
	// now if the remaining number is greater than 2 add to list
	if(n>2)
	factorList.add(n);
	}
	  
	// public methods
	public boolean hasMoreFactors(){
	// return true if size is greater than factorIndex
	if(factorIndex < (factorList.size()))
	return true;
	  
	// else return false
	return false;
	}

	public int nextFactor(){

	// return next factor and increment factor index

	// check if factor exist
	if(hasMoreFactors()){
	// after return the index is incremented
	return factorList.get(factorIndex++);
	}
	  
	// else return -1
	return -1;
	}

	// reset
	public void reset(){
	factorIndex = 0;
	}
	}

