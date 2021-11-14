package com.hemebiotech.analytics;
public class Analyse {
	
	String reader;
	String writer;
	int  counter;

	

	
	//constructeur
	
public Analyse (int counter,String writer, String reader,String writer1){
		
   this.reader = reader;
   this.writer= writer;
   this.counter = counter;
   
    
   
}
 //COMPORTEMENTS

String readSymptoms() {
	return ("reader symptoms");
}

String writeSymptoms () {
	return ("writer symptoms");
}

	   String counterSymtoms() {
		   return("counter symptoms");
}
}
