package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 

	public class ReadSymptomDataFromFile implements ISymptomReader{
	private String filepath;

	/**
	 * @param filepath
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public ReadSymptomDataFromFile() {
	}

	ArrayList<String> result = new ArrayList<String>();
	public char[] reader;
	public char[] read;
	{

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void Reader() {
		System.out.println("lire les symptoms des effets secondaire");

	}

	@Override
	public void ReaderEffetSecondaire() {
		System.out.println("lire les effets secondaire");

	}

	public void lireSymptoms() {

		System.out.println("lire les symptoms");

	}

	@Override
	public void ReaderLeNombreOccurrence() {
		System.out.println("lire le nombre d'occurrences");

	}

}
