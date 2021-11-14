package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteSymptomDataFromFile implements ISymptomWriter {

	public char[] writer;
	private int  getNombreOccurrences;

	public WriteSymptomDataFromFile(String writer) {
	}

	{
		System.out.println("writer");
	}

	public static void main(String args[]) throws IOException {

		File file = new File("list.size"); // LINE A

		// creates the file
		file.createNewFile();

		// creates a FileWriter Object
		FileWriter fw = new FileWriter(file);

		// writes the content to the file
		fw.write("List.size"); // LINE B
		fw.flush();
		fw.close();

		// creates a FileReader Object
		FileReader fr = new FileReader(file);
		char[] output = new char[50];

		fr.read(output); // reads the content to the array

		for (char out : output) {
			System.out.print(out); // prints the characters one by one
		}

		fr.close();
	}

	public int  writer() {
		return (int) getNombreOccurrences;

	}

	public List<String> GetSymptoms() {
		
		return GetSymptoms();
	}

	@Override
	public String writeDataOnFile(Map<String, Integer> mSymptom) throws IOException {
		
		return null;
	}

	@Override
	public int countOccurrences(List<String> symptomList, List<String> listToCount) {
		
		return 0;
	}

	@Override
	public void generateOutputFile(String text) {
		return;

	}
}
