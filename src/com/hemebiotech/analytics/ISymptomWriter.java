package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ISymptomWriter {

	 public String writeDataOnFile (Map<String,Integer>mSymptom) throws IOException;
	 
	 int countOccurrences(List<String> symptomList, List<String> listToCount);
	 
	 void generateOutputFile(String text);

	}




	
	


